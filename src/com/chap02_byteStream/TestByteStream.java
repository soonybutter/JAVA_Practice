package com.chap02_byteStream;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
//FileInputStream & FileOutputStream 테스트
	public void fileSave() {
		//출력 - output
		FileOutputStream fout = null;
		
		try {
		    fout = new FileOutputStream("sample.txt");
		    
		    fout.write(97); // sample.txt에 a입력
		    byte[] bar = {98,99,100,101,102};
		    fout.write(bar);
		    fout.write(10);
		    fout.write(bar,1,3);

		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
			    fout.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void fileOpen() {
		//입력= FileInputStream
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("sample.txt");  //파일명 오류 만들어준 상황
			
			//System.out.println(fin.read());
			
			// byte배열을 이용해서 전체 읽어오기!
			int fileSize = (int) new File("sample.txt").length();
			byte[] bar = new byte[fileSize ];
			
			fin.read(bar);
			
			for(int i=0; i<bar.length; i++) {
				System.out.print(bar[i] +" ");
			}
			
			
			/*
			//byte배열 사용 안하고 전체 읽어오기!!
			int val =0;
			while((val=fin.read()) != -1) {
				System.out.println((char)val);
			}
			*/
			
			
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		finally {
			try {
				fin.close();
			}
			catch(IOException e){
				e.printStackTrace();
				
			}
		}
		
	}
	
	public void fileOpen2()  {
		//input
		//예외처리시 try with resource 구문을 활용
		
		try( FileInputStream fin = new FileInputStream("sample.txt")){
			
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
