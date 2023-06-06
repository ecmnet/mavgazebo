package com.comino.gazebo.libvision.boofcv;

import java.util.ArrayList;
import java.util.List;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;

import com.comino.gazebo.libvision.callback.IGazeboDepthImageCallback;
import com.comino.gazebo.libvision.callback.IGazeboFPVImageCallback;
import com.comino.gazebo.libvision.callback.IGazeboGroundTruthCallback;
import com.comino.gazebo.libvision.callback.IGazeboPoseCallback;

import boofcv.struct.image.GrayU16;
import boofcv.struct.image.GrayU8;
import boofcv.struct.image.Planar;
import gazebo.msgs.ImageStampedOuterClass.ImageStamped;
import georegression.geometry.ConvertRotation3D_F64;
import georegression.struct.se.Se3_F64;
import nav_msgs.msgs.OdometryOuterClass.Odometry;
import sensor_msgs.msgs.GroundtruthOuterClass.Groundtruth;


public class StreamGazeboVision {

	private static StreamGazeboVision instance;

	public static final double 	FROM_RAD = 180.0 / Math.PI ;

	private final List<IGazeboPoseCallback>        callbacks_pose            = new ArrayList<IGazeboPoseCallback>();
	private final List<IGazeboGroundTruthCallback> callbacks_groundtruth     = new ArrayList<IGazeboGroundTruthCallback>();
	private final List<IGazeboDepthImageCallback>  callbacks_depth           = new ArrayList<IGazeboDepthImageCallback>();
	private final List<IGazeboFPVImageCallback>  callbacks_fpv               = new ArrayList<IGazeboFPVImageCallback>();
	
	private final int width;
	private final int height;


	private final Node node = new Node("default");

	private  Subscriber<ImageStamped> sub_depth;
	private  Subscriber<ImageStamped> sub_fpv;
	private  Subscriber<Odometry> sub_odm;
	private  Subscriber<Groundtruth> sub_gth;

	private static long tms0; 
	private static long tms;
	private static long tms_g0; 
	private static long tms_g;
	private static long tms_d0; 
	private static long tms_d;
	private static long tms_r0; 
	private static long tms_r;
	private int  fps;

	private boolean is_available;


	public static StreamGazeboVision getInstance(int width, int height) {
		if(instance==null)
			instance = new StreamGazeboVision(width,height);
		return instance;
	}

	private  StreamGazeboVision(int width, int height) {
        this.width = width;
        this.height = height;
	}

	public StreamGazeboVision registerCallback(IGazeboPoseCallback callback) {
		this.callbacks_pose.add(callback);
		return this;
	}

	public StreamGazeboVision registerCallback(IGazeboGroundTruthCallback callback) {
		this.callbacks_groundtruth.add(callback);
		return this;
	}

	public StreamGazeboVision registerDepthCallback(IGazeboDepthImageCallback callback) {
		this.callbacks_depth.add(callback);
		return this;
	}
	
	public StreamGazeboVision registerRGBCallback(IGazeboFPVImageCallback callback) {
		this.callbacks_fpv.add(callback);
		return this;
	}

	public static float byteArrayToFloat(byte[] bytes, int offset) {
		return Float.intBitsToFloat(bytes[0+offset] << 24 | (bytes[1+offset] & 0xFF) << 16 | (bytes[2+offset] & 0xFF) << 8 | (bytes[3+offset] & 0xFF));  
	}


	public void start() throws Exception {

		final Se3_F64         current_pose         = new Se3_F64();
		final Se3_F64         current_speed        = new Se3_F64();
		final Se3_F64         current_acceleration = new Se3_F64();

		final GrayU16         _depth_image         = new GrayU16(848,480);  
		final Planar<GrayU8>  rgb                  = new Planar<GrayU8>(GrayU8.class,width,height,3);


		if(!node.waitForConnection()) {
			is_available = false;
			throw new Exception("Gazebo not available");
		}

		is_available = true;

		System.out.println("Gazebo vision plugin started for SITL");

		System.out.print("Subcribing to gazebo messages ...");

		System.out.print("depth, ");
		
		final int x_offset = ( _depth_image.width  - width  ) /2;
		final int y_offset = ( _depth_image.height - height ) /2;

		sub_depth = node.subscribe("iris/depth_camera/link/depth_camera/image", ImageStamped.getDefaultInstance(), (msg) -> {
			synchronized(sub_depth) {
				sub_depth.notifyAll();
				

				tms_d = System.currentTimeMillis();
				// Avoid double trigger
				if((tms_d - tms_d0) < 20)
					return;
			

				int n = 0;
				byte[] buffer = msg.getImage().getData().toByteArray();

				for(int y = 0; y < msg.getImage().getHeight();y++) {
					for(int x = 0; x < msg.getImage().getWidth();x++) {
						n = (x+y*msg.getImage().getWidth())*4;
						_depth_image.set(x, y, (int)((buffer[n+0] & 0xFF) << 0 | (int)((buffer[n+1] & 0xFF) << 8 | (buffer[n+2] & 0xFF) << 16 | (buffer[n+3] & 0xFF) << 24)) 
								/ 3000 );
					}
				}


				for(IGazeboDepthImageCallback callback : callbacks_depth) {
					callback.handle(tms_d, _depth_image.subimage(x_offset,y_offset, _depth_image.width - x_offset, _depth_image.height - y_offset));
				}

				tms_d0 = tms_d;

			}	
		});
		
		System.out.print("rgb, ");
		sub_fpv = node.subscribe("iris/fpv_cam/link/camera/image", ImageStamped.getDefaultInstance(), (msg) -> {
			synchronized(sub_fpv) {
				sub_fpv.notifyAll();
				

				tms_r = System.currentTimeMillis();
				// Avoid double trigger
				if((tms_r - tms_r0) < 20)
					return;
				
				byte[] buffer = msg.getImage().getData().toByteArray();
				
				int n = 0;
				
				for(int y = 0; y < msg.getImage().getHeight();y++) {
					for(int x = 0; x < msg.getImage().getWidth();x++) {
						n = (x+y*msg.getImage().getWidth())*3;
						rgb.bands[0].set(x*2, y*2   , buffer[n]);      rgb.bands[0].set(x*2+1, y*2   , buffer[n]);
						rgb.bands[0].set(x*2, y*2+1 , buffer[n]);      rgb.bands[0].set(x*2+1, y*2+1 , buffer[n]);
						rgb.bands[1].set(x*2, y*2   , buffer[n+1]);    rgb.bands[1].set(x*2+1, y*2   , buffer[n+1]);
						rgb.bands[1].set(x*2, y*2+1 , buffer[n+1]);    rgb.bands[1].set(x*2+1, y*2+1 , buffer[n+1]);
						rgb.bands[2].set(x*2, y*2   , buffer[n+2]);    rgb.bands[2].set(x*2+1, y*2   , buffer[n+2]);
						rgb.bands[2].set(x*2, y*2+1 , buffer[n+2]);    rgb.bands[2].set(x*2+1, y*2+1 , buffer[n+2]);
					}
				}	
				
				for(IGazeboFPVImageCallback callback : callbacks_fpv) {
					callback.handle(tms_d,rgb);
				}

				tms_r0 = tms_r;

			}	
		});



		System.out.print("vision_odom, ");

		sub_odm = node.subscribe("!", Odometry.getDefaultInstance(), (msg) -> {

			synchronized(sub_odm) {

				sub_odm.notifyAll();

				tms = System.currentTimeMillis();

				// Avoid double trigger
				if((tms - tms0) < 200)
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




				for(IGazeboPoseCallback callback : callbacks_pose) {
					callback.handle(tms, 100, current_pose, current_speed, current_acceleration);
				}
			}

		});

		System.out.print("groundtruth");
		sub_gth = node.subscribe("iris/groundtruth", Groundtruth.getDefaultInstance(), (msg) -> {
			synchronized(sub_gth) {	
				sub_gth.notifyAll();	

				tms_g = System.currentTimeMillis();

				if((tms_g - tms_g0) < 50)
					return;

				for(IGazeboGroundTruthCallback callback : callbacks_groundtruth)
					callback.handle(tms, msg.getLatitudeRad()* FROM_RAD, msg.getLongitudeRad()* FROM_RAD, msg.getAltitude());	

				tms_g0 = tms_g;
			}
		});

		System.out.println();


	}

	public boolean isAvailable() {
		return is_available;
	}

	public void stop() {


	}

	public int getFrameRate() {
		return fps;
	}

}
