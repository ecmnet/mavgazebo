package org.gazebosim.examples;

import org.gazebosim.transport.Node;
import org.gazebosim.transport.Subscriber;

import sensor_msgs.msgs.GroundtruthOuterClass.Groundtruth;

public class GroundTruthExample {
	
	private static double simTime = 0;
	private static Subscriber<Groundtruth> sub;
	
	private static Groundtruth msg;


	public static void main(String[] args) {
		
		
		Node node = new Node("default");
		try {
			node.waitForConnection();
		
			
			sub = node.subscribe("iris/groundtruth", Groundtruth.getDefaultInstance(), 
			 (m) -> {
				 System.out.println(m.getTimeUsec()+":"+m.getVelocityUp());
				synchronized(sub) {
					sub.notifyAll();
			 }
			});


			while(true) {
				
				
				Thread.sleep(100);
			}


		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
