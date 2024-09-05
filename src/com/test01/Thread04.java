package com.test01;

public class Thread04 {

	public static void main(String[] args) {
		My03 m1 = new My03("야옹");
		My03 m2 = new My03("멍멍");
		
		m1.start();
		try {
			m1.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		m2.start();

	}

}
