package com.comino.gazebo.libvision.callback;

import boofcv.struct.image.GrayU16;

public interface IGazeboDepthImageCallback {

	public void handle(long tms, GrayU16 depth);

}
