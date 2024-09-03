package com.collection.part03_map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public void testProperties() {
		//key, value 모두 String
		Properties prop = new Properties();
		

		prop.setProperty("name", "kim");
		prop.setProperty("age", "20");
		prop.setProperty("addr", "korea seoul");
		prop.setProperty("phone", "010-2222-2222");
		
		System.out.println(prop);
		
		//prop에 저장한 값을 외부에 properties 파일로 저장
		try{
			prop.store(new FileOutputStream("my.properties"),"my profile");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
			
		
	}
	
	public void testProperties2() {
		Properties prop = new Properties();
		
		//외부 파일의 데이터를 읽어와서 prop에 저장하겠다.
		try {
			prop.load(new FileInputStream("my.properties"));
			
			prop.list(System.out); //console에 출력하겠다.
			
			System.out.println("----------------");
			
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("age"));
			System.out.println(prop.getProperty("adr"));
			System.out.println(prop.getProperty("phone"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
