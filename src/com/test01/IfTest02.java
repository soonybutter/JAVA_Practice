package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//else if 구문. 다중 조건을 줄 수 있다.
	//else에 if(조건) 더하여 여러가지 조건을 줄 수 있다.
	
	public void testElseIf01() {
		int i = 10;
		int j = 20;
		
		if(i==j) {
			System.out.println("i와 j가 같습니다.");
		}else if(i>j) {
			System.out.println("i가 j보다 큽니다.");
		}else if(i<j) {
			System.out.println("i가 j보다 작습니다.");
		}
	}
	
	public void testElseIf02() {
		//점수 하나를 입력 받아 등급을 나누어 점수와 등급 출력
		//90 이상은 A,
		//80 이상은 B
		//70 이상 C
		//60이상 D
		// 60 미만 F
		
		Scanner sc = new Scanner(System.in);
		
		int point = 78;
		char grade;
		
		if(point >= 90) {
			grade = 'A';
		}
		else if(point < 90 && point >= 80) {
			grade = 'B';
		}
		else if(point < 80 && point >=70) {
			grade = 'C';
		}
		else if(point <70 && point >=60) {
			grade = 'D';
		}
		else {
			grade ='F';
		}
		
		System.out.printf("당신의 점수는 %d 이고, 등급은 %c입니다.",point, grade);
		//포맷문자와 같은 객수, 같은 자료형.
		//정해져있는 형식에 맞춰 값을 줄바꿈하지않고 출력.
		
		//포멧문자
		//%d : 정수
		//%c : 문자
		//%f : 실수
		//%s : 논리값
		//%5d : 5칸 확보하고 우측정렬
		//%-5d : 5칸 확보하고 좌측정렬
		//%.2f : 소수점 아래 2자리까지 표시
		//%s : 문자열
		
		//특수문자
		// tab : \t, new line: \n
			
		
	}
				

}
