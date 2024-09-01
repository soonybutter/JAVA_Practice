package com.test01.chap01_encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Account op = new Account();
		Account op1 = new Account();
		
		//잔액조회
		op.display();
		
		op.in(100);
		op.display();
		
		op.out(50);
		op.display();
		
		//op.balance -= 50; 
		//캡슐화 : 다음과 같은 데이터의 접근을 제한해야함..
		
		op.out(30);
		op.display();
		
		
		

	}

}
