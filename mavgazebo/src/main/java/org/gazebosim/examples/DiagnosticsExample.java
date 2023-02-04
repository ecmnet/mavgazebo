package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;
import org.gazebosim.transport.SubscriberCallback;

import gazebo.msgs.DiagnosticsOuterClass.Diagnostics;

public class DiagnosticsExample {
	
	private static double simTime = 0;
	private static Subscriber<Diagnostics> sub;


	public static void main(String[] args) {
		
		
		Node node = new Node("default");
		try {
			node.waitForConnection();
			
			sub = node.subscribe("diagnostics", Diagnostics.getDefaultInstance(),
					new SubscriberCallback<Diagnostics>() {
						@Override
						public void callback(Diagnostics msg) {
							simTime = msg.getRealTimeFactor();
							System.out.println(simTime);
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
			e.printStackTrace();
		}

	}

}
