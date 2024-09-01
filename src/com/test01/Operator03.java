package com.test01;

public class Operator03 {
	
	public static void main(String[] args) {
		
		Operator03 op = new Operator03();
		
		op.opTest1();
		op.opTest2();
		
	}
	//삼항연산자
	//항목이 3개: (조건식)?조건이 참일때: 조건이 거짓일때;
	public void opTest1() {
		int num =-1;

		//String res = (num>0)?"양수다.":"양수가 아니다.";
		String res = (num>0)?"양수다.":(num==0)?"0이다.":"음수다.";
		
		System.out.println(res);
		System.out.println("-----------");
		
	}
	
	//산술대입연산자/ 복합대입연산자
	//+=. -=, *=. /= ...
	public void opTest2() {
		int num=12;
		
		System.out.println("num: "+ num);
		
		//num을 3증가
		num = num+3;
		System.out.println("3 증가 후 num: "+ num);
		
		//복합대입 연산자 활용
		//3증가
		num+=3;
		System.out.println("num에 +=3 실행: "+ num);
		
		num-= 5;
		System.out.println("num에 -=5 실행: "+ num);
		System.out.println("-----------");
		
		
	}

}
