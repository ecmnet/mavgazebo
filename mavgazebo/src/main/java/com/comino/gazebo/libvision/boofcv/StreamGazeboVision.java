package com.comino.gazebo.libvision.boofcv;

import java.util.ArrayList;
import java.util.List;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;

import com.comino.gazebo.libvision.callback.IGazeboGroundTruthCallback;
import com.comino.gazebo.libvision.callback.IGazeboPoseCallback;

import georegression.geometry.ConvertRotation3D_F64;
import georegression.struct.se.Se3_F64;
import nav_msgs.msgs.OdometryOuterClass.Odometry;
import sensor_msgs.msgs.GroundtruthOuterClass.Groundtruth;


public class StreamGazeboVision {

	private static StreamGazeboVision instance;
	
	public static final double 	FROM_RAD = 180.0 / Math.PI ;

	private final List<IGazeboPoseCallback> callbacks_pose                   = new ArrayList<IGazeboPoseCallback>();
	private final List<IGazeboGroundTruthCallback> callbacks_groundtruth     = new ArrayList<IGazeboGroundTruthCallback>();
	private final Node node = new Node("default");
	
	private  Subscriber<Odometry> sub_odm;
	private  Subscriber<Groundtruth> sub_gth;

	private static long tms0; 
	private long tms;
	private int  fps;

	private long c = 0;


	public static StreamGazeboVision getInstance(int width, int height) {
		if(instance==null)
			instance = new StreamGazeboVision(width,height);
		return instance;
	}

	private  StreamGazeboVision(int width, int height) {

	}

	public StreamGazeboVision registerCallback(IGazeboPoseCallback callback) {
		this.callbacks_pose.add(callback);
		return this;
	}
	
	public StreamGazeboVision registerCallback(IGazeboGroundTruthCallback callback) {
		this.callbacks_groundtruth.add(callback);
		return this;
	}

	public void start() {

		final Se3_F64    current_pose         = new Se3_F64();
		final Se3_F64    current_speed        = new Se3_F64();
		final Se3_F64    current_acceleration = new Se3_F64();

		try {

			node.waitForConnection();

			System.out.print("Subcribing to gazebo messages ...");

			System.out.print("vision_odom, ");
			sub_odm = node.subscribe("iris_vision/vision_odom", Odometry.getDefaultInstance(), (msg) -> {

				synchronized(sub_odm) {
					
					sub_odm.notifyAll();

					tms = System.currentTimeMillis();

					// Avoid double trigger
					if((tms - tms0) < 5)
						return;

					current_pose.T.setTo (msg.getPosition().getY(),msg.getPosition().getX(),-msg.getPosition().getZ());
					current_speed.T.setTo(msg.getLinearVelocity().getY(),msg.getLinearVelocity().getX(),-msg.getLinearVelocity().getZ());

					ConvertRotation3D_F64.quaternionToMatrix(
						    msg.getOrientation().getW(),
						    msg.getOrientation().getX(),
						   -msg.getOrientation().getY(),
						   -msg.getOrientation().getZ(), current_pose.getRotation());

					if(tms!=tms0)
						fps = (int)(1000.0f/(tms - tms0));

					tms0 = tms;

					for(IGazeboPoseCallback callback : callbacks_pose)
						callback.handle(tms, 1, current_pose, current_speed, current_acceleration);

				}


			});
			
			System.out.print("groundtruth");
			sub_gth = node.subscribe("iris_vision/groundtruth", Groundtruth.getDefaultInstance(), (msg) -> {
				synchronized(sub_gth) {	
					sub_gth.notifyAll();	
					for(IGazeboGroundTruthCallback callback : callbacks_groundtruth)
						callback.handle(tms, msg.getLatitudeRad()* FROM_RAD, msg.getLongitudeRad()* FROM_RAD, msg.getAltitude());	
				}
			});
			
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public void stop() {


	}

	public int getFrameRate() {
		return fps;
	}

}
