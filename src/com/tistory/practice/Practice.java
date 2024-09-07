package com.tistory.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Practice {

	public static void main(String[] args) {
		
		InputStream in = System.in;
		OutputStream out = System.out;
		
		try {
			int data = in.read(); //디폴트 : 아스키코드값으로 읽어온다
			System.out.println((char)data); //char로 형변환하면 문자 그대로의 값을 확인할 수 있다. 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
