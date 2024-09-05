package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyClient {

	public static void main(String[] args) throws IOException{
		//데이터 받는 소켓 만들자..
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트");
		
		//받을 data 저장할 배열 생성
		byte[] buff = new byte[1024];
		 
		//datagramPacket 생성
		DatagramPacket receiveP =
				new DatagramPacket(buff,buff.length); //배열과 크기를 넣어줌.
		
		//저장. 받자
		ds.receive(receiveP);
		System.out.println(new String(receiveP.getData()));
		
		//종료
		ds.close();
		ds.disconnect();
		

	}

}
