package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;
import org.gazebosim.transport.SubscriberCallback;

import gazebo.msgs.ImageStampedOuterClass.ImageStamped;
import nav_msgs.msgs.OdometryOuterClass.Odometry;
import sensor_msgs.msgs.GroundtruthOuterClass.Groundtruth;

public class GroundTruthExample {
	
	private static double simTime = 0;
	private static Subscriber<Groundtruth> sub;
	
	private static Groundtruth msg;


	public static void main(String[] args) {
		
		
		Node node = new Node("default");
		try {
			node.waitForConnection();
		
			
			sub = node.subscribe("iris_vision/groundtruth", Groundtruth.getDefaultInstance(), 
			 (m) -> {
				 msg = m;
				synchronized(sub) {
					sub.notifyAll();
			 }
			});


			while(true) {
				
				if(msg!=null)
				System.out.println(msg.getTimeUsec()+":"+msg.getVelocityUp());

				Thread.sleep(100);
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
