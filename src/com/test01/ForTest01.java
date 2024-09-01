package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		
		//testFor1();
		//testFor2();
		
		//testFor4();
		
		testFor5();
	}
	
	public static void testFor1() {
		
		for(int i=0; i<=10; i+=2) {
			System.out.println("i="+i);
		}
		
		System.out.println("-------");
	}
	
	public static void testFor2() {
		//반복하며 출력문 실행
		//1~10 숫자 역순으로 출력
	
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		//초기식과 증감식은 1개 이상 작성 가능.
		//조건은 1개만 있어야함!
		for(int i=0,j=10; i<10&& j>0 ; i++,j--) {
			
			System.out.println("i : "+ i + ", j : "+ j);
			
		}
		
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch); 
		}
		
		
		//while문 처럼 사용
		int i = 1;
		for(;;) {
			System.out.print(i+" ");
			i++;
			if(i==10) {
				break;
			}
		}
	}
	
	public static void testFor4() {
		//정수를 하나 입력받아 그 수가 양수일 때만 그 수의 구구단을 출력
		// 양수가 아니면 "1~9 사이의 양수를 입력하세요" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 하나 입력: ");
		int num= sc.nextInt();
		
		if(num>0) {
			for(int i=1; i<=9; i++) { 
				System.out.println(num+" * "+ i+" = "+num*i);
			}
		}
		else {
			System.out.println("1~9 사이의 양수를 입력하세요");
		}
		
		
		
	}
	
	public static void testFor5() {
		//1~100 사이의 임의의 난수를 하나 구한 다음
		//1~ 난수 까지의 합계를 구하고 출력
		
		int ran = (int)(Math.random()*100) + 1; 
		int sum = 0;
		
		for(int i=1; i<=ran; i++) {
			sum+=i;
			
		}
		
		System.out.println("1부터 "+ran+"까지 정수들의 합계: "+ sum);
		
	}

}
