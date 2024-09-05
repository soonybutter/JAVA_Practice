package com.test01;

public class Thread02 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new My01());
		Thread t2 = new Thread(new My02());
		
		t1.start();
		t2.start();
		
	}

}

class My01 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("My01");
		}
	}
}


class My02 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("My02");
		}
		
	}
	
}
