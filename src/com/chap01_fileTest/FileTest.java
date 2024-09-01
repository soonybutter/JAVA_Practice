package com.chap01_fileTest;

import java.io.File;
import java.io.IOException;;

public class FileTest {

	public static void main(String[] args) {
		//File 클래스 테스트
		File file = new File("person.txt"); // 파일안에 person.txt 파일과 연결시키겠다.
		System.out.println("파일명: "+ file.getName());
		System.out.println("경로: "+ file.getPath());
		System.out.println("용량: "+ file.getAbsolutePath());
		System.out.println("상위폴더: "+ file.getParent());
		
		
		try {
			//파일이 없는 경우 파일을 생성
			//생성을 했다 : true 리턴
			//기존 파일이 존재한다-> 안만들고 false 리턴
			boolean b = file.createNewFile();
			
			boolean b2 = file.delete();
			
			System.out.println(b);
			System.out.println(b2);
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		
		

	}

}
