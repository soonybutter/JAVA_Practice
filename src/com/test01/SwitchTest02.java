package com.test01;

import java.util.Scanner;

public class SwitchTest02 {

	public void test1() {
		//정수 두개와 연산기호문자 1개를 입력 받아서.
		//연산기호문자(+,-,*,/)에 해당하는 계산을 수행하고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값: ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/): ");
		char op = sc.next().charAt(0); //맨앞에 있는것을 문자 타입으로 가져오겠다.
		
		int res = 0;
		
		switch(op) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		}
		
		System.out.println(num1+" "+ op+ " "+num2 +" = "+ res);
	}

}
