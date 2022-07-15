package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;

import gazebo.msgs.ImagesStampedOuterClass.ImagesStamped;

public class StereoCameraExample {
	
	private static double simTime = 0;
	private static Subscriber<ImagesStamped> sub;
	
	private static ImagesStamped msg;


	public static void main(String[] args) {
		

		
		Node node = new Node("default");
		
		try {
			node.waitForConnection();
			
			sub = node.subscribe("iris_vision/stereo_camera/link/stereo_camera/images", ImagesStamped.getDefaultInstance(), 
			 (m) -> {
				
				synchronized(sub) {
					sub.notifyAll();
					System.out.println(m);
			 }
			});


			while(true) {
				
//				if(msg!=null)
//				System.out.println(msg.getImageCount());

				Thread.sleep(100);
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
