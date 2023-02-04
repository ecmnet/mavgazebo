package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;

import gazebo.msgs.ImageStampedOuterClass.ImageStamped;

public class DepthCameraExample {
	
	private static double simTime = 0;
	private static Subscriber<ImageStamped> sub;
	
	private static ImageStamped msg;

    static long  tms0;
	
	public static void main(String[] args) {
		

		
		Node node = new Node("default");
		
		try {
			node.waitForConnection();
			
			System.out.println("Connected");
			
			sub = node.subscribe("iris/depth_camera/link/depth_camera/image", ImageStamped.getDefaultInstance(), 
			 (m) -> {
				System.out.println(m.getClass()+":"+m.hasImage()+"/"+m.getImage().getWidth()+"*"+m.getImage().getHeight());
				synchronized(sub) {
				sub.notify();
			 }
			});


			while(true) {
				
//				if(msg!=null)
//				System.out.println(msg.getImage().getHeight());

				Thread.sleep(100);
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
