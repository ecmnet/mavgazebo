package com.comino.gazebo.libvision.callback;


public interface IGazeboGroundTruthCallback {

	public void handle(long tms, double lat, double lon, double altitude);

}
