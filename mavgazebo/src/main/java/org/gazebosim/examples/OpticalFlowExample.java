package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;
import org.gazebosim.transport.SubscriberCallback;

import gazebo.msgs.ImageStampedOuterClass.ImageStamped;
import nav_msgs.msgs.OdometryOuterClass.Odometry;
import sensor_msgs.msgs.GroundtruthOuterClass.Groundtruth;
import sensor_msgs.msgs.OpticalFlowOuterClass.OpticalFlow;

public class OpticalFlowExample {
	
	private static double simTime = 0;
	private static Subscriber<OpticalFlow> sub;


	public static void main(String[] args) {
		
		
		Node node = new Node("default");
		try {
			node.waitForConnection();
		
			
			sub = node.subscribe("iris_vision/px4flow/link/opticalFlow", OpticalFlow.getDefaultInstance(), 
			 (msg) -> {
				
				System.out.println(msg.getTimeUsec()+":"+msg.getQuality());
				synchronized(sub) {
					sub.notifyAll();
					
			 }
			});


			while(true) {

				Thread.sleep(100);
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
