package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;
import org.gazebosim.transport.SubscriberCallback;

import msgs.gazebo.msgs.ImageStampedOuterClass.ImageStamped;
import msgs.nav_msgs.msgs.OdometryOuterClass.Odometry;

public class OdometryExample {
	
	private static double simTime = 0;
	private static Subscriber<Odometry> sub;
	
	private static Odometry msg;


	public static void main(String[] args) {
		
		
		Node node = new Node("default");
		try {
			node.waitForConnection();
		
			
			sub = node.subscribe("iris_vision/vision_odom", Odometry.getDefaultInstance(), 
			 (m) -> {
				 msg = m;
				synchronized(sub) {
					sub.notifyAll();
			 }
			});


			while(true) {
				
				if(msg!=null)
				System.out.println(msg.getTimeUsec()+":"+msg.getLinearVelocity().getX());

				Thread.sleep(100);
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
