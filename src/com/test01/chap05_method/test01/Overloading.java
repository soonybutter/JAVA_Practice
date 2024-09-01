package com.test01.chap05_method.test01;

public class Overloading {
	//메소드이름 같다. 매개변수의 갯수 or 타입이 달라야함!
	
	public int test() {
		return 0;
	}
	
	public int test(int a) {
		return 0;
	}
	
	public int test(int a, int b) {
		return 0;
		
	}
	public int test(int a, String s) {
		return 0;
		
	}
	public int test(String s) {
		return 0;
	}
	
	/* 에러 발생: 매개변수 명은 오버로딩과 상관없다.
	public int test(int b, int a)
	{
		return 0;
	}
	*/
	
	public String test(int a, int b, String str) {
		return null;
	}
	
	/* 에러: 리턴타입이 다르다고 오버로딩이 적용되지 않음.
	public int test(int a, int b, String s) {
		return null;
	}
	*/
	
	/* 에러 발생: 접근제한자가 다르다고 오버로딩이 적용되지 않는다.
	private String test(int a, int b, String s) {
		return null;
	}
	*/
	
	
	/* 에러 발생 : 예약어가 추가되더라도 오버로딩이 적용되지 않는다
	public final String test(int a, int b, String str) {
		return null;
	}
	*/
	
	
	public String test(String s, int a, int b) {
		return null;
		
	}
	
	
	
	
	
	

}
