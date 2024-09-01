package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 extends  MethodTest01 {
	public static void main(String[] args) {
		//static 메소드 실행 : 실행하려는 메소드가 작성된 크래스.메소드명();
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();  //상속해주면 사용가능
		//MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		
		
		
	}

}
