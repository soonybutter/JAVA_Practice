package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void testIf() {
		//단독 if문
		//조건식의 결과가 참(true)이면 { } 안에 있는 코드 실행
		//조건식의 결과가 거짓(false)이면 { } 안에 있는 코드 무시하고 넘어간다.
				
		int num = 4;
		
		//짝수인지 조건을 확인
		if(num%2==0) {
			//조건이 참일때 실행
			System.out.println("num의 값은 짝수입니다.");
			
		}
		
		if(num%2 !=0) {
			System.out.println("num의 값은 홀수입니다.");
			
		}
		
		System.out.println("종료!");
		System.out.println("---------");
	}
	
	public void testIfElse01() {
		//if else 문
		//둘 중 한개를 선택하는 조건문. 
		//조건이 참인 경우와 거짓인 경우에 수행하는 명령어를 따로 작성.
		//else에서는 조건식 사용불가
		
		/* testIf()에서 실행했던 if문들을
		 *  if else 로 변경하여 실행 */
		
		int num = 4;
		
		if(num%2==0) {
			//조건이 참일때
			//num이 짝수일때
			System.out.println("num은 짝수입니다.");
		}
		else {
			System.out.println("num은 홀수입니다.");
		}
		System.out.println("종료");
		System.out.println("---------");
		
		
	}
	
	public void testIfElse02() {
		//50보다 큰 수 인지
		//50보다 작은 수 인지 확인하고 
		//"50 보다 크다"/ "50보다 작다"라고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 정수 입력: ");
		int no = sc.nextInt();
		
		if(no>=50) {
			if(no%2==0) {
				System.out.println("50보다 큰 짝수");
			}
			else {
				System.out.println("50보다 큰 홀수");
			}
		}
		else{
			System.out.println("50보다 작다.");
			
		}
		
		System.out.println("---------");
	}
	
	public void testIfElse03() {
		//숫자를 하나 입력받아 양수인지 음수인지 출력.
		//단, 0이면 "0입니다"라고 출력(if 중첩)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		
		int num = sc.nextInt();
		
		if(num==0) {
			System.out.println("0입니다.");
	     	return;
			
		}
		else if( num>0) {
			System.out.println("양수입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
		
		System.out.println("---------");
		
	}


}
