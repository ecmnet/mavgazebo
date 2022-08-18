package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;

import msgs.gazebo.msgs.AnyOuterClass.Any;
import msgs.gazebo.msgs.ImageOuterClass.Image;
import msgs.gazebo.msgs.ImageStampedOuterClass.ImageStamped;
import msgs.gazebo.msgs.ImagesStampedOuterClass.ImagesStamped;

public class StereoCameraExample {
	
	private static double simTime = 0;
	private static Subscriber<ImageStamped> sub;
	
	private static ImageStamped msg;


	public static void main(String[] args) {
		

		
		Node node = new Node("default");
		
		try {
			node.waitForConnection();
			
			sub = node.subscribe("iris_vision/depth_camera/link/depth_camera/image ", ImageStamped.getDefaultInstance(), 
			 (m) -> {
				System.out.println(m);
				synchronized(sub) {
					sub.notifyAll();
					
			 }
			});


			while(true) {
				
//				if(msg!=null)
//				System.out.println(msg.getImage().getHeight());

				Thread.sleep(100);
			}


		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
