package com.comino.gazebo.test;

import java.awt.image.BufferedImage;

import com.comino.gazebo.libvision.boofcv.StreamGazeboVision;

import boofcv.gui.image.ImageGridPanel;
import boofcv.gui.image.ImagePanel;
import boofcv.gui.image.ShowImages;
import boofcv.io.image.ConvertBufferedImage;
import georegression.struct.se.Se3_F64;

public class GazeboVisionTest {
	
	

	public static void main(String[] args)  {
		
		ImageGridPanel gui = new ImageGridPanel(1, 1);
		gui.setImage(0, 0, new BufferedImage(640, 480, BufferedImage.TYPE_USHORT_GRAY));
		gui.autoSetPreferredSize();
		
		ShowImages.showWindow(gui, "Gazebo Depth cam", true);
		
		try {
			
			StreamGazeboVision vis = StreamGazeboVision.getInstance(640,480);
			
			vis.registerCallback((tms, image) ->  {
				ConvertBufferedImage.convertTo(image, gui.getImage(0, 0), true);
				gui.repaint();
			});
			
			vis.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		while(true) {
			try {
				Thread.sleep(333);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		//	System.out.println(pos.T);
		}

	}

}
