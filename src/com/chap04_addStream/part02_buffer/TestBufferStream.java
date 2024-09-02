package com.chap04_addStream.part02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream {
	//보조스트림
	
	public void output() {
		//BufferedWriter
		//new 보조스트림 (new 다른스트림());
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("sample3.txt"));
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("안녕히계세요\n");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public void input() {
		//bufferedReader
		//sample3.txt와 연결!
		
		//스트림 생성
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("sample3.txt"));
			//readLine() : 더이상 읽을문자가 없어서 끝나면 nul값을 준다.
			//throws 사용하는 메서드-> 반드시 예외처리 !!
			
			String tmp =null;
			while((tmp=br.readLine())!= null) {
				System.out.println(tmp);
			}
			
			
		}
		catch(FileNotFoundException e ) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
				
				
			
				
		
	}
	
	
	
	
	
	

}
