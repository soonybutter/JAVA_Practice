package com.chap03_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	//FileReader & FileWriter
	public void fileSave() {
		//output
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("sample2.txt");
			//파일이 존재하지 않으면 자동으로 생성
			
			fw.write("문자열 가능 ");
			fw.write('A');
			fw.write(' ');
			char[] carr = {'a','p','p','l','e'};
			fw.write(carr);
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		//input
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample2.txt");
			/*
			for(int i=0; i<30; i++) {
				System.out.println((char)(fr.read()));
			}
			*/
			
			int val = 0;
			while((val=fr.read()) != -1) {
				System.out.println((char)val);
			}
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
