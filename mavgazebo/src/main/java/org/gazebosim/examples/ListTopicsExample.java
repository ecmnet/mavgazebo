package org.gazebosim.examples;

import org.gazebosim.transport.Node;

public class ListTopicsExample {
	

	public static void main(String[] args) {
		

		
		Node node = new Node("default");
		
		try {
			node.waitForConnection();
			
		
			node.getPublishedMessages().values().forEach((r) -> {
				 System.out.printf("%-40s: %-100s\n",r.getMsgType(), r.getTopic());
			});
	

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
