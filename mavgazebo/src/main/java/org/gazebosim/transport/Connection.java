/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2016. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.gazebosim.transport;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.StandardSocketOptions;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.protobuf.ByteString;
import com.google.protobuf.Message;

import gazebo.msgs.PacketOuterClass.Packet;
import gazebo.msgs.TimeOuterClass.Time;


/**
 * Manages a Gazebo protocol connection.
 *
 * This can connect to either the Gazebo server, or to a data
 * publisher. Additionally, it can act as the TCP client, or as a
 * server. In either case, it provides methods to read and write
 * structured data on the socket.
 */
public class Connection {
	private static int HEADER_SIZE = 8;
	
	public String host;
	public int port;
	
	private Socket socket;
	private ServerSocket ssocket;
	private OutputStream os;
	
	private ByteBuffer buf = ByteBuffer.allocateDirect (1024*8192);
	private byte[] buf_header = new byte[HEADER_SIZE];
	private SocketChannel chan;
	private int size;
	
	private static final Logger LOG = Logger.getLogger("Gazebo Transport");

	public void connect(String host, int port) throws UnknownHostException, IOException {
		final SocketAddress socketAddr = new InetSocketAddress (host, port);
		chan = SocketChannel.open ();
		chan.connect (socketAddr);
		buf.limit (0);
		os = chan.socket().getOutputStream();
	}

	public boolean connectAndWait(String host, int port) throws IOException, InterruptedException {
		this.host = host;
		this.port = port;
		final SocketAddress socketAddr = new InetSocketAddress (host, port);
		int count = 2;
		while (--count > 0) {
			try {
			    chan = SocketChannel.open ();
				chan.connect (socketAddr);
				break;
			} catch (ConnectException ex) {
				ex.printStackTrace();
				Thread.sleep(5000);
			}
		}
		if(count == 0)
			return false;
		buf.limit (0);
		  os = chan.socket().getOutputStream();
		return true;
	}

	public void serve(final ServerCallback cb) throws IOException {
		ssocket = new ServerSocket(0);
		host = ssocket.getInetAddress().getHostAddress();
		port = ssocket.getLocalPort();

		//enable user to change master uri via environment variable GAZEBO_MASTER_URI
		//TODO : allow for automatic guesing of IP. Look at Connection.cc in gazebo for C++ example
		String user_defined_ip = System.getenv("GAZEBO_IP");
        if (user_defined_ip != null) {
          host = InetAddress.getByName(user_defined_ip).getHostAddress();;
          LOG.warning("Using custom host: "+host);
        }

		new Thread("Gazebo Server Thread") {
			@Override
			public void run() {
				LOG.config("Listening on "+host+":"+port);
				while (true) {
					Connection conn = new Connection();
					try {
						conn.socket = ssocket.accept();
						conn.os = conn.socket.getOutputStream();
						LOG.info("Handling connect from "+conn.socket.getInetAddress());
						cb.handle(conn);
					} catch (IOException e) {
						LOG.log(Level.WARNING, "Cannot handle client", e);
					}
				}
			}
		}.start();
	}

	public void close() throws IOException {
		LOG.info("Closing connection");
		if(chan!=null)
		  chan.close();
		
		if (ssocket != null) {
			ssocket.close();
			ssocket = null;
		}
	}
	
	public byte[] rawRead() throws IOException {
		ensure(HEADER_SIZE,buf,chan);
		buf.get(buf_header);
		
		try {
		   size = Integer.parseInt(new String(buf_header), 16);
		} catch(NumberFormatException e) { }
		
		byte[] buf_data = new byte[size];
		ensure(size,buf,chan);
		buf.get(buf_data);
		
		return buf_data;
		
	}

	
	public Packet read() throws IOException {
		byte[] buff = rawRead();
		if (buff == null) {
			return null;
		}
		return Packet.parseFrom(buff);
	}

	public void write(Message msg) throws IOException {
        ByteString data = msg.toByteString();
        ByteString header = ByteString.copyFromUtf8(String.format("%08X", data.size()));
        ByteString bytes = header.concat(data);

        synchronized (os) {
			os.write(bytes.toByteArray());
		}
	}

	public void writePacket(String name, Message req) throws IOException {
		long ms = System.currentTimeMillis();
		Time t = Time.newBuilder().setSec((int) (ms / 1000)).setNsec((int) ((ms%1000)*1000)).build();
		Packet pack = Packet.newBuilder().setType(name).setStamp(t)
							.setSerializedData(req.toByteString()).build();
		write(pack);
	}
	
	private void ensure (int len, ByteBuffer buf, ByteChannel chan) throws IOException
    {
        if (buf.position() > buf.capacity () - len) {
            buf.compact ();
            buf.flip ();
        }
        while (buf.remaining () < len) {
            int oldpos = buf.position ();
            buf.position (buf.limit ());
            buf.limit (buf.capacity ());
            chan.read (buf);
            buf.limit (buf.position ());
            buf.position (oldpos);
        }
    }

}
