package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;
import org.gazebosim.transport.SubscriberCallback;

import gazebo.msgs.ImageStampedOuterClass.ImageStamped;

public class DeptCameraExample {
	
	private static double simTime = 0;
	private static Subscriber<ImageStamped> sub;


	public static void main(String[] args) {
		
		
		Node node = new Node("default");
		try {
			node.waitForConnection();
			
			sub = node.subscribe("iris/front_camera/link/depth_camera/image", ImageStamped.getDefaultInstance(),
					new SubscriberCallback<ImageStamped>() {
						@Override
						public void callback(ImageStamped msg) {
							System.out.println(msg.getTime());
							synchronized(sub) {
								sub.notifyAll();
							}
						}
					}
				);


			while(true) {

				Thread.sleep(100);
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
