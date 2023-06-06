package com.comino.gazebo.libvision.callback;

import boofcv.struct.image.GrayU8;
import boofcv.struct.image.Planar;

public interface IGazeboFPVImageCallback {

	public void handle(long tms, Planar<GrayU8> rgb);

}
