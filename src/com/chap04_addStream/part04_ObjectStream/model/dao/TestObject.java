package com.chap04_addStream.part04_ObjectStream.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.chap04_addStream.part04_ObjectStream.model.dto.Member;

public class TestObject {

	public void output() {
		Member[] marr = {
				new Member("user01","pass01","양다연",20,'여',1250.7),
				new Member("user02","pass02","이개똥",23,'남',1240.7),
				new Member("user03","pass03","김미나",25,'여',1220.7),
		};
		
		//ObjectOutputStream
		ObjectOutputStream objOut = null;
		
		try {
			objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));
			
			for(int i=0; i<marr.length; i++) {
				objOut.writeObject(marr[i]);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			objOut.close();
		}
		

	}
	
	
	public void input() {
		Member[] mar = new Member[3];
		
		ObjectInputStream objIn =null;
		try {
			objIn = new ObjectInputStream(new FileInputStream("member.txt"));
			
			for(int i=0; i<mar.length; i++) {
				
		mar[i] = (Member)objIn.readObject(); //저장된 객체를 하나씩 실행할대마다 read함!
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				objIn.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		for(Member m:mar) {
			System.out.println(m);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
