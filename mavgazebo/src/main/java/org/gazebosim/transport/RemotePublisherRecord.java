/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.gazebosim.transport;

import gazebo.msgs.PublishOuterClass.Publish;

public class RemotePublisherRecord implements PublisherRecord {
	private Publish pub;

	public RemotePublisherRecord(Publish pub) {
		this.pub = pub;
	}

	@Override
	public String getTopic() {
		return pub.getTopic();
	}

	@Override
	public String getHost() {
		return pub.getHost();
	}

	@Override
	public int getPort() {
		return pub.getPort();
	}

	@Override
	public String getMsgType() {
		return pub.getMsgType();
	}
	
	public String toString() {
		return String.format("%s (%s) %s:%s", getTopic(), getMsgType(), getHost(), getPort()); 
	}

	@Override
	public void connect(Connection conn) {
		throw new RuntimeException("Someone thinks we're a remote server, can't connect.");
	}
}
