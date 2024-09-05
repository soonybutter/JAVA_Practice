package com.test01;

public class MTest {

	//program : 실행할 수 있는 파일(.exe)
	//process : 실행되고 있는 상태
	//thread: 하나의 프로세스에 여러개의 쓰레드가 실행
	
	//Process - T, T, T, T ,,,
	//1. Runnable를 implements 
	//2. Thread를 extends
	
	
	public static void main(String[] args) {
		System.out.println("---main start---");
		
		Thread01 m1 = new Thread01();
		Thread01 m2 = new Thread01();
		
		//run() 메소드를 main에서 호출해서 실행한것.
		//m1.run();
		//m2.run();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		
		//start() -> run() 호출 : 각각의 스레드들이 동시에 작업됨..
		t1.start();
		t2.start();
		
		
		System.out.println("---main stop---");

	}

}
