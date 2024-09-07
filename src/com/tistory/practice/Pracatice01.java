package com.tistory.practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Pracatice01 {
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
		String s = "asdfasdf";//출력할 문자열
		
		bw.write(s);//출력
		bw.newLine(); //줄바꿈
		bw.flush();//남아있는 데이터를 모두 출력시킴
		bw.close();//스트림을 닫음
		
	}
	
}
