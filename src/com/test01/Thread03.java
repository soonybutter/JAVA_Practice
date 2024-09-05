package com.test01;

public class Thread03 {
	public static void main(String[] args) {
		My03 m1 = new My03("야옹");
		My03 m2 = new My03("멍멍");
		
		//스케쥴링
		
		m1.setPriority(10);
		m2.setPriority(1);
		
		m1.start();
		m2.start();
		
		
	}

}

//Thread 상속받아서 
class My03 extends Thread{
	
	public My03(String name) {
		super(name); // 상속받은 곳에 name 저장..
		
	}
	
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println(getName()+"="+i);
			
		}
		System.out.println("====="+getName()+" 끝!!=====");
		
	}
	
}
