package com.test02;

public class TestMain {
	public static void main(String[] args) {
		//1. 전달받은 수가 5의 배수이면 "5의 배수입니다."출력"
		new Test().test01(10);
		
		
		//2. 전달받은 수가 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다." 출력
		//      아니라면, "2와 3의 배수가 아닙니다." 출력
		new Test().test02(31);
		
		//3. 전달받은 문자가 소문자라면 "소문자입니다." ,대문자면 "대문자입니다."를 출력
		// Character Class의 Method 활
		new Test().test03('f');
	}

}
