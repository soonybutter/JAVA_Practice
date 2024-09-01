package com.test01;

public class Operator01 {
	
	public static void main(String[] args) {
		
	//non static method 실행
		Operator01 op = new Operator01();
		op.test();
		op.test2();
		
		
		
	}
	// !논리값 : 논리값을 반대로 바꾸는 연산자
	// !true : false, !false: true
	public void test() {
		System.out.println("true의 부정: "+!true);
		System.out.println("false의 부정: "+!false);
		
		int num = 5;
		System.out.println("num의 값이 짝수인가? "+(num%2==0));
		System.out.println("num의 값이 짝수인가? "+(num%2!=0));
	}
	
	//증감연산자
	// ++ : 1증가, ++값, 값++
	// -- : 1감소, --값, 값--
	public void test2() {
		int age =20;
		System.out.println("---------------");
		System.out.println("age: "+ age);
		++age;
		System.out.println("++age 결과: "+ age);
		age++;
		System.out.println("age++ 결과: "+ age);
		
		System.out.println("---------------");
		
		int num1 = 20;
		//후위연산자
		//다른 연산 처리 후 증감
		int res = num1++ * 3;
		System.out.println("res: "+res);
		System.out.println("num1: "+ num1);
		
		int num2 = 20;
		res = ++num2 * 3;
		System.out.println("res: "+res);
		System.out.println("num2: "+ num2);
		
		int a = 10;
		int b = ++a;
		System.out.println(b);
		System.out.println(a);
		
		
		
	}

}
