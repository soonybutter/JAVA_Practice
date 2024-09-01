package com.test01.chap05_method.test02;

public class NonStaticMethodTest {

	//매개변수와 반환값 유무에 따른 메소드 구분
	
	//1. 매개변수 없고, 반환값도 없는 메소드
	public void method1() {
		//아무 값도 반환하지 않고 메소드 내용 수행 후 리턴값없이 호출한 메소드로 돌아간다.
		System.out.println("매개변수와 반환값이 둘다 없는 메소드");
		
		return; //생략(jvm이 자동 생성)
	}
	
	//2. 매개변수 없고 반환값 있는 메소드
	public String method2() {
		
		return "매개변수가 없지만 반환값이 있는 메소드"+"메소드";
	}
	
	//3. 매개변수 있고 반환값 없는 메소드 
	public void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum: "+ sum);
		return;
	}
	
	//4. 매개변수 있고 반환값 있는 메소드
	public int method4(int num1, int num2) {
		//리턴값으로 메소드 선언시 지정한 리턴타입과 일치하는 자료형의 데이터를 되돌려 주어야한다.
		return num1+num2;
	}
	
	
}
