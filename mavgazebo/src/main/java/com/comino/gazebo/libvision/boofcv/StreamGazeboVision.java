package com.comino.gazebo.libvision.boofcv;

import java.util.ArrayList;
import java.util.List;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;

import com.comino.gazebo.libvision.callback.IGazeboPoseCallback;

import boofcv.struct.image.GrayU8;
import boofcv.struct.image.Planar;
import georegression.geometry.ConvertRotation3D_F64;
import georegression.struct.se.Se3_F64;
import nav_msgs.msgs.OdometryOuterClass.Odometry;


public class StreamGazeboVision {

	private static StreamGazeboVision instance;

	private final List<IGazeboPoseCallback> callbacks     = new ArrayList<IGazeboPoseCallback>();
	private final Node node = new Node("default");
	private  Subscriber<Odometry> sub;
	
	private long tms0; 
	private long tms;
	private int  fps;


	public static StreamGazeboVision getInstance(int width, int height) {
		if(instance==null)
			instance = new StreamGazeboVision(width,height);
		return instance;
	}

	private  StreamGazeboVision(int width, int height) {
		
	}

	public StreamGazeboVision registerCallback(IGazeboPoseCallback callback) {
		this.callbacks.add(callback);
		return this;
	}

	public void start() {
		
		final Se3_F64    current_pose         = new Se3_F64();
		final Se3_F64    current_speed        = new Se3_F64();
		final Se3_F64    current_acceleration = new Se3_F64();
		
		try {
			
			node.waitForConnection();
			
			
			sub = node.subscribe("iris_vision/vision_odom", Odometry.getDefaultInstance(), (msg) -> {
				
				tms = System.currentTimeMillis();
				
				current_pose.T.setTo (msg.getPosition().getY(),msg.getPosition().getX(),-msg.getPosition().getZ());
				current_speed.T.setTo(msg.getLinearVelocity().getY(),msg.getLinearVelocity().getX(),-msg.getLinearVelocity().getZ());
				
				ConvertRotation3D_F64.quaternionToMatrix(
						msg.getOrientation().getW(),
						msg.getOrientation().getX(),
						msg.getOrientation().getY(),
						msg.getOrientation().getZ(), current_pose.getRotation());
				
				if(tms!=tms0)
					fps = (int)(1000.0f/(tms - tms0));
				
				tms0 = tms;

				for(IGazeboPoseCallback callback : callbacks)
					callback.handle(tms, 1, current_pose, current_speed, current_acceleration);
				
				synchronized(sub) {
					sub.notifyAll();
				}
			});
			
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
