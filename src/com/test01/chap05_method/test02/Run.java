package com.test01.chap05_method.test02;

public class Run {

	public static void main(String[] args) {
		NonStaticMethodTest test = new NonStaticMethodTest();
		test.method1();
		//반환값이 있는 메소드 호출일 경우
		//일반적으로 리턴타입과 일치하는 타입의 변수에 리턴값을 담아서 사용
		String res = test.method2();
		System.out.println(res);
		System.out.println(test.method2());
		
		//메소드 실행시 전달하는 인자값의 타입과 순서와 갯수를 메소드의 매개변수와 일치하게 작성.
		test.method3(10,20);
		
		int result = test.method4(10, 20);
		System.out.println("result: "+ result);
		System.out.println("res: "+ test.method4(20, 30));
		
		
		

	}

}
