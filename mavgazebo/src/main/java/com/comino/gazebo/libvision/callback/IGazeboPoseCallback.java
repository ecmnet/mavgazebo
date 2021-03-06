package com.comino.gazebo.libvision.callback;

import georegression.struct.se.Se3_F64;

public interface IGazeboPoseCallback {

	public void handle(long tms, int tracker_confidence , Se3_F64 pose, Se3_F64 speed, Se3_F64 acc);

}
