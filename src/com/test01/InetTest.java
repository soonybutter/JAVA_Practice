package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		
		System.out.println(addr); //->호스트이름/ip주소
		System.out.println("localhost: "+ addr.getHostAddress());  //ip주소
		System.out.println("name: "+ addr.getHostName()); //호스트이름
		
		InetAddress[] naver = InetAddress.getAllByName("www.naver.com"); //이름으로 가져오겠다
		
		for(int i=0; i<naver.length; i++) {
			System.out.println(naver[i].getHostAddress());
		}


	}

}
