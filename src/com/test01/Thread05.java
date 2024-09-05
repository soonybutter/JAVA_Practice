package com.test01;

public class Thread05 {
	public static void main(String[] args) {
		for(int i=0; i<50; i++) {
			
			try {
				Thread.sleep(3000);//3초 동안 대기! 
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("★★ "); //3초있다가 출력됨
		}
	}

}
