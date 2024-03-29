package com.comino.gazebo.estimators;

import org.ejml.dense.row.CommonOps_DDRM;
import org.mavlink.messages.MAV_ESTIMATOR_TYPE;
import org.mavlink.messages.MAV_FRAME;
import org.mavlink.messages.MAV_SEVERITY;
import org.mavlink.messages.MSP_CMD;
import org.mavlink.messages.MSP_COMPONENT_CTRL;
import org.mavlink.messages.lquac.msg_msp_command;
import org.mavlink.messages.lquac.msg_msp_vision;
import org.mavlink.messages.lquac.msg_odometry;

import com.comino.gazebo.libvision.boofcv.StreamGazeboVision;
import com.comino.mavcom.control.IMAVMSPController;
import com.comino.mavcom.mavlink.IMAVLinkListener;
import com.comino.mavcom.model.DataModel;
import com.comino.mavcom.model.segment.EstStatus;
import com.comino.mavcom.model.segment.LogMessage;
import com.comino.mavcom.model.segment.Status;
import com.comino.mavcom.model.segment.Vision;
import com.comino.mavcom.struct.Attitude3D_F64;
import com.comino.mavcom.utils.MSP3DUtils;
import com.comino.mavcom.utils.MSPCovariance;
import com.comino.mavodometry.estimators.MAVAbstractEstimator;
import com.comino.mavutils.MSPMathUtils;

import georegression.geometry.GeometryMath_F64;
import georegression.struct.point.Vector3D_F64;
import georegression.struct.se.Se3_F64;

// Note: Requires odomtery disabled in SDF <send_odometry>0</send_odometry>

public class MAVGazeboVisPositionEstimator extends MAVAbstractEstimator  {

	private final float             MAX_VEL_TESTRATIO    = 0.5f;
	private final int     	        MAX_ERRORS           = 5;

	private final float			    STD_VEL_COVARIANCE   = 0.1f;  // set to NaN to use in EKF2 parameter
	private final float             RESET_VEL_COVERIANCE = 2.0f;

	// MAVLink messages
	private final msg_msp_vision    msg             = new msg_msp_vision(2,1);
	private final msg_odometry      odo             = new msg_odometry(1,1);

	private final DataModel 	    model;
	private final Se3_F64           to_ned          = new Se3_F64();
	private final Se3_F64           to_body         = new Se3_F64();

	private final Se3_F64           ned      		= new Se3_F64();
	private final Se3_F64           ned_s    		= new Se3_F64();
	private final Se3_F64           body_s    		= new Se3_F64();
	private final Vector3D_F64      offset_pos_ned  = new Vector3D_F64();
	private final Vector3D_F64      lpos_current_s  = new Vector3D_F64();
	private final Attitude3D_F64    att_euler       = new Attitude3D_F64();
	private final Attitude3D_F64    att_offset      = new Attitude3D_F64();

	private long                    tms_reset       = 0;
	private int                     reset_count     = 0;

	private final float[]           groundtruth     = new float[3];
	private float                   cov_velocity    = STD_VEL_COVARIANCE;

	private final StreamGazeboVision vis;
	
	private MSPCovariance                  cov_s = new MSPCovariance(10);

	private int                     error_count     = 0;


	public MAVGazeboVisPositionEstimator(IMAVMSPController control) {
		super(control);
		this.model = control.getCurrentModel();
		this.vis   = StreamGazeboVision.getInstance(640,480);
		this.model.vision.setStatus(Vision.ENABLED, vis.isAvailable());

		control.registerListener(msg_msp_command.class, new IMAVLinkListener() {
			@Override
			public void received(Object o) {
				msg_msp_command cmd = (msg_msp_command)o;
				switch(cmd.command) {
				case MSP_CMD.MSP_CMD_SET_HOMEPOS:
					setGlobalOrigin(cmd.param1 / 1e7f, cmd.param2 / 1e7f, cmd.param3 / 1e3f );
					break;

				case MSP_CMD.MSP_CMD_VISION:

					switch((int)cmd.param1) {

					case MSP_COMPONENT_CTRL.ENABLE:
						init("enable");
						model.vision.setStatus(Vision.ENABLED, true);
						break;
					case MSP_COMPONENT_CTRL.DISABLE:
						model.vision.setStatus(Vision.ENABLED, false);
						break;
					case MSP_COMPONENT_CTRL.RESET:
						init("Reset");
						break;
					}
					break;
				}
			}
		});

		control.getStatusManager().addListener(Status.MSP_ARMED, (n) -> {
			if(n.isStatus(Status.MSP_ARMED) && n.isStatus(Status.MSP_LANDED)) {
				init("armed");
			}
		});

		control.getStatusManager().addListener(Status.MSP_GPOS_VALID, (n) -> {
			if(model.gps.numsat > 8 && n.isStatus(Status.MSP_GPOS_VALID) && n.isStatus(Status.MSP_LANDED))
				init("gpos");

		});

		offset_pos_ned.setTo(0,0,0);
		model.vision.setStatus(Vision.ENABLED, true);
		publishMSPFlags(DataModel.getSynchronizedPX4Time_us());

		groundtruth[0] = Float.NaN;
		groundtruth[1] = Float.NaN;
		groundtruth[2] = Float.NaN;

		vis.registerCallback((tms,lat,lon,alt) -> {
			if(MSPMathUtils.is_projection_initialized()) {
				MSPMathUtils.map_projection_project(lat, lon, groundtruth);
				groundtruth[2] = -((float)alt - model.home_state.g_alt);

				model.vision.gx  = groundtruth[0];
				model.vision.gy  = groundtruth[1];
				model.vision.gz  = groundtruth[2];
			}	
		});

		vis.registerCallback((tms, confidence, p, s, a) ->  {

			model.sys.setSensor(Status.MSP_OPCV_AVAILABILITY, true);

			MSP3DUtils.convertModelToSe3_F64(model, to_ned);
			CommonOps_DDRM.transpose(to_ned.R, to_body.R);
			


			// Simulate T265 reset cycle
			if(tms_reset > 0 && ((System.currentTimeMillis() - tms_reset) < 2000)) {

				error_count = 0;

				model.vision.setStatus(Vision.RESETTING, true);
				model.vision.setStatus(Vision.ERROR, false);

				MSP3DUtils.convertCurrentPosition(model, offset_pos_ned);
				offset_pos_ned.scale(-1);
				offset_pos_ned.plusIP(p.T);
				offset_pos_ned.scale(-1);

				att_euler.setFromMatrix(p.R);		
				att_offset.set(model.attitude.r - att_euler.getRoll(),
						model.attitude.p - att_euler.getPitch(), 
						model.attitude.y - att_euler.getYaw()
						);

				cov_velocity = RESET_VEL_COVERIANCE;

				return;
			}


			model.vision.setStatus(Vision.AVAILABLE, true);
			model.vision.setStatus(Vision.RESETTING, false);

			tms_reset = 0;

			if(!model.vision.isStatus(Vision.ENABLED)) {
				model.vision.setStatus(Vision.SPEED_VALID, false);
				model.vision.setStatus(Vision.POS_VALID, false);
				model.vision.setStatus(Vision.PUBLISHED, false);
				publishMSPFlags(DataModel.getSynchronizedPX4Time_us());
				return;
			}


			if(model.sys.isSensorAvailable(Status.MSP_GPS_AVAILABILITY) && 	model.est.isFlagSet(EstStatus.EKF_GPS_GLITCH)) {

				model.vision.setStatus(Vision.SPEED_VALID, false);
				model.vision.setStatus(Vision.POS_VALID, false);
				model.vision.setStatus(Vision.ERROR, true);	
				if(++error_count > MAX_ERRORS) {
					init("EKF2 Glitch");
					return;
				}
				return;
			}



			ned.setTo(p);
			ned_s.setTo(s);


			//			double noisex = (double)Math.random()+0.5;
			//			double noisey = (double)Math.random()+0.5;
			//			double noisez = (double)Math.random()+0.5;

			//			// Simulate a 5 secs vision glitch between 20 and 24 secs arming
			//			if(model.sys.t_armed_ms > 20000 && model.sys.t_armed_ms < 25000) {
			//				ned_s.T.x *= noisex; ned_s.T.y *= noisey; ned_s.T.z *= noisez;
			//			}
			//
			//
						if(model.sys.t_armed_ms > 30000 && model.sys.t_armed_ms <40000) {
							ned_s.T.x *= -1;
						}
			//
			//			// Simulate a 10secs vision glitch between 40 and 60 secs arming
			//			if(model.sys.t_armed_ms > 40000 && model.sys.t_armed_ms < 60000) {
			//				double tmp = ned_s.T.x;
			//				ned_s.T.x = ned_s.T.y*noisex; ned_s.T.y = tmp * noisey; ned_s.T.z *= noisez;
			//				ned.T.x   *= noisex; ned.T.y   *= noisey; ned.T.z   *= noisez;
			//			}

			att_euler.setFromMatrix(ned.R).add(att_offset);			
			model.vision.setStatus(Vision.ERROR, false);

			ned.T.plusIP(offset_pos_ned);

			GeometryMath_F64.mult( to_body.R, ned_s.T ,body_s.T );

			MSP3DUtils.convertCurrentSpeed(model, lpos_current_s);
			
			

			if(model.sys.isSensorAvailable(Status.MSP_GPS_AVAILABILITY) && 	model.est.velRatio > MAX_VEL_TESTRATIO) {

				model.vision.setStatus(Vision.SPEED_VALID, false);
				model.vision.setStatus(Vision.POS_VALID, false);
				model.vision.setStatus(Vision.ERROR, true);		

				publishMSPFlags(tms);



				if(++error_count > MAX_ERRORS) {
					init("EKF2 TestRatio");
					return;
				}

				publishMSPFlags(tms);

				return;
			}

			model.vision.setStatus(Vision.POS_VALID, true);
			model.vision.setStatus(Vision.SPEED_VALID, true);
			model.vision.setStatus(Vision.AVAILABLE, true);


			// Filter a covariance for velocity based on test ratio
			if(Float.isFinite(model.est.velRatio) && model.est.velRatio > 0 && Float.isFinite(cov_velocity))
				cov_velocity = cov_velocity * 0.98f + model.est.velRatio * 3f *0.02f;
			//			model.debug.x = cov_velocity;

			publishPX4Odometry(ned.T,body_s.T, MAV_FRAME.MAV_FRAME_LOCAL_NED, cov_velocity ,confidence,tms);

			// Publish to GCL
			publishMSPVision(ned,ned_s, tms);

			model.vision.setAttitude(att_euler);
			model.vision.setPosition(ned.T);
			model.vision.setSpeed(ned_s.T);


			model.vision.tms = tms * 1000;

			model.vision.fps = vis.getFrameRate();
			
			simulateFiducial(model, 3.0f);

		});

	}


	public void reset() {
		init("external");
	}


	@Override
	public void enableStream(boolean enable) {


	}

	@Override
	public void start() throws Exception {
		vis.start();

	}

	@Override
	public void stop() {

	}

	public void init(String s) {

		tms_reset = System.currentTimeMillis();
		reset_count++; 

		if(s!=null)
			writeLogMessage(new LogMessage("[vio] Gazebo vision reset ["+s+"]", MAV_SEVERITY.MAV_SEVERITY_WARNING));

		model.vision.setStatus(Vision.RESETTING, true);
		model.vision.setStatus(Vision.POS_VALID, false);
		model.vision.setStatus(Vision.SPEED_VALID, false);
		publishMSPFlags(DataModel.getSynchronizedPX4Time_us());

	}

	private void publishPX4Odometry(Vector3D_F64 pose, Vector3D_F64 speed, int frame, float cov_vel, int confidence, long tms) {

		odo.estimator_type = MAV_ESTIMATOR_TYPE.MAV_ESTIMATOR_TYPE_VISION;
		odo.frame_id       = frame;
		odo.child_frame_id = MAV_FRAME.MAV_FRAME_BODY_FRD;

		odo.time_usec =  tms * 1000;

		odo.x = (float) pose.x;
		odo.y = (float) pose.y;
		odo.z = (float) pose.z;

		odo.vx = (float) speed.x;
		odo.vy = (float) speed.y;
		odo.vz = (float) speed.z;

		// Use EKF params

		odo.pose_covariance[0] = Float.NaN;

		if(Float.isFinite(cov_vel))
			build_covariance(cov_vel,odo.velocity_covariance);
		else
			odo.velocity_covariance[0] = Float.NaN;


		// do not use twist
		odo.q[0] = Float.NaN;

		odo.reset_counter = reset_count;
		
		control.sendMAVLinkMessage(odo);

		model.sys.setSensor(Status.MSP_OPCV_AVAILABILITY, true);
		model.vision.setStatus(Vision.PUBLISHED, true);

	}

	//	private void publishPX4NaN(int frame, long tms) {
	//
	//		odo.estimator_type = MAV_ESTIMATOR_TYPE.MAV_ESTIMATOR_TYPE_VISION;
	//		odo.frame_id       = frame;
	//		odo.child_frame_id = MAV_FRAME.MAV_FRAME_BODY_FRD;
	//
	//		odo.time_usec =  tms * 1000;
	//
	//
	//		odo.x = Float.NaN;
	//		odo.y = Float.NaN;
	//		odo.z = Float.NaN;
	//
	//
	//		odo.vx = Float.NaN;
	//		odo.vy = Float.NaN;
	//		odo.vz = Float.NaN;
	//
	//		// Use EKF params
	//		odo.pose_covariance[0] = Float.NaN;
	//		odo.velocity_covariance[0] = Float.NaN;
	//
	//		// do not use twist
	//		odo.q[0] = Float.NaN;
	//
	//
	//		odo.reset_counter = reset_count;
	//
	//		control.sendMAVLinkMessage(odo);
	//
	//
	//	}


	private void publishMSPVision(Se3_F64 pose, Se3_F64 speed, long tms) {


		msg.x =  (float) pose.T.x;
		msg.y =  (float) pose.T.y;
		msg.z =  (float) pose.T.z;

		msg.vx =  (float) speed.T.x;
		msg.vy =  (float) speed.T.y;
		msg.vz =  (float) speed.T.z;

		msg.h   = (float)att_euler.getYaw();
		msg.r   = (float)att_euler.getRoll();
		msg.p   = (float)att_euler.getPitch();

		msg.quality = 100;
		msg.errors  = 0;
		msg.tms     = tms * 1000;
		msg.flags   = model.vision.flags;
		msg.fps     = model.vision.fps;

		control.sendMAVLinkMessage(msg);


	}

	private void publishMSPFlags(long tms) {

		msg.quality = (int)(100);
		msg.errors  = 0;
		msg.tms     = tms * 1000;
		msg.flags   = model.vision.flags;
		msg.fps     = model.vision.fps;

		control.sendMAVLinkMessage(msg);

	}


	private void build_covariance(float cov_in, float[] cov) {

		cov[0]  = cov_in;   cov[1]  = 0; cov[2]  = 0; cov[3]  = 0; cov[4]  = 0; cov[5]  = 0;
		cov[6]  = cov_in;   cov[7]  = 0; cov[8]  = 0; cov[9]  = 0; cov[10] = 0;
		cov[11] = cov_in;   cov[12] = 0; cov[13] = 0; cov[14] = 0;
		cov[15] = 0; cov[16] = 0; cov[17] = 0;
		cov[18] = 0; cov[19] = 0; 
		cov[20] = 0;

	}


	// TODO: Move to commander
	private void setGlobalOrigin(double lat, double lon, double altitude) {

		if(model.sys.isSensorAvailable(Status.MSP_GPS_AVAILABILITY) || model.sys.isStatus(Status.MSP_GPOS_VALID))
			return;

		// Note: In SITL Set global origin causes BARO failure 
		// TODO: To be investigated in PX4

		//
		//			msg_set_gps_global_origin gor = new msg_set_gps_global_origin(1,1);
		//			gor.target_system = 1;
		//			gor.latitude = (long)(lat * 1e7);
		//			gor.longitude = (long)(lon * 1e7);
		//			gor.altitude = (int)(altitude * 1000);
		//			gor.time_usec = DataModel.getSynchronizedPX4Time_us();
		//
		//			control.sendMAVLinkMessage(gor);
		//
		//			MSPLogger.getInstance().writeLocalMsg("[msp] Setting reference position",
		//					MAV_SEVERITY.MAV_SEVERITY_INFO);

	}
	
	
	private void simulateFiducial(DataModel model, float radius) {


		if(model.sys.isStatus(Status.MSP_LANDED)) {
			model.vision.setStatus(Vision.FIDUCIAL_LOCKED, false);
			msg.px    =  Float.NaN;
			msg.py    =  Float.NaN;
			msg.pz    =  Float.NaN;
			msg.pw    =  Float.NaN;
			msg.flags =  model.vision.flags;
			control.sendMAVLinkMessage(msg);
			return;
		}

		if(!model.vision.isStatus(Vision.FIDUCIAL_LOCKED) && model.sys.isStatus(Status.MSP_LPOS_VALID) && 
				!model.sys.isNavState(Status.NAVIGATION_STATE_AUTO_TAKEOFF) ) {

			//			if(control.isSimulation())	
			//				TestActionFactory.setRandomObstacle();

			model.vision.setStatus(Vision.FIDUCIAL_LOCKED, true);
			model.vision.setStatus(Vision.FIDUCIAL_ENABLED, true);

			model.vision.px = model.state.l_x + ((float)Math.random()-0.5f)*radius;
			model.vision.py = model.state.l_y + ((float)Math.random()-0.5f)*radius;
			model.vision.pz = 0.5f;	
			model.vision.pw = ((float)Math.random()-0.5f)*12f;

			//model.vision.pw = MSPMathUtils.toRad(135);

			System.out.println("Simulated fiducial rotation: "+MSPMathUtils.fromRad(model.vision.pw));

			msg.px    =  model.vision.px;
			msg.py    =  model.vision.py;
			msg.pz    =  model.vision.pz;
			msg.pw    =  model.vision.pw;
			msg.flags =  model.vision.flags;
			control.sendMAVLinkMessage(msg);
		} 

	}





}
