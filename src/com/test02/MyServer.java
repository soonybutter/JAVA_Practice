package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MyServer {
	public static void main(String[] args) throws IOException{
		// {
		//UDP (보내기만 하면 끝임)
		//데이터 보내는 소켓 생성
		DatagramSocket ds = new DatagramSocket();
		System.out.println("서버 입니다.");
		
		//보낼 data
		byte[] buff = "UDP 테스트 입니다.".getBytes();
		
		//datagram packet으로 감싼다.
		//localhost == 127.0.0.1
		DatagramPacket sendP =
				new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"),9999);//localhost로 돌리겠다, 포트넘버9999
		
		//보낸다
		ds.send(sendP);
		
		//종료
		ds.close();
		ds.disconnect();

	}

}
