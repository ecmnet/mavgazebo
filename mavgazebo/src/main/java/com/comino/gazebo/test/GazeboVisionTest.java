package com.comino.gazebo.test;

import com.comino.gazebo.libvision.boofcv.StreamGazeboVision;

import georegression.struct.se.Se3_F64;

public class GazeboVisionTest {

	public static void main(String[] args)  {
		
		Se3_F64 pos = new Se3_F64();
		
		try {
			
			StreamGazeboVision vis = StreamGazeboVision.getInstance(640,480);
			
			vis.registerCallback((tms, confidence, p, s, a) ->  {
				pos.setTo(p);
				System.out.println(pos.T);
			});
			
			vis.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		while(true) {
			try {
				Thread.sleep(333);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	System.out.println(pos.T);
		}

	}

}
