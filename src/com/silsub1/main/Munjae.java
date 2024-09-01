package com.silsub1.main;

import java.util.Scanner;

public class Munjae {
	
	
	//1
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어성적 입력: ");
		int kor= sc.nextInt();
		System.out.print("영어성적 입력: ");
		int eng= sc.nextInt();
		System.out.print("수학성적 입력: ");
		int math= sc.nextInt();
		
		int sum =kor+ eng+ math;
		int avg = (sum/3);
		
		if(kor>=40 && eng >=40 && math>=40) {
			if(avg>=60) {
				System.out.println("합계: "+sum+" , 평균: "+avg);
			}
			else {
				System.out.println("불합격");
			}
			
		}
		else {
			System.out.println("불합격");
		}
		
		System.out.println("--------");
		
		
	}
	
	//2
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 초기 메뉴 ***");
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		System.out.print("메뉴번호 입력: ");
		int order = sc.nextInt();
		
		
		if(order==1) {
			System.out.println("입력메뉴가 선택되었습니다.");
		}
		else if(order==2) {
			System.out.println("수정메뉴가 선택되었습니다.");
		}
		else if(order==3) {
			System.out.println("조회메뉴가 선택되었습니다.");
		}
		else if(order==4) {
			System.out.println("삭제메뉴가 선택되었습니다.");
		}
		else if(order==7) {
			System.out.println("프로그램이 종료됩니다.");
		}
		else {
			System.out.println("번호가 잘못 입력되었습니다.");
			System.out.println("다시 입력하십시오.");
		}
		
		System.out.println("--------");
		
	}
	
	//3
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요: ");
		int num= sc.nextInt();
		
		if(num>0) {
			System.out.println("양수다.");
		}
		else {
			System.out.println("양수가 아니다.");
		}
		
		System.out.println("--------");
	}
	
	//4
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요: ");
		int num = sc.nextInt();
		
		String str;
		
		if(num>0) {
			if(num%2==0) {
				str="짝수다";
				System.out.println(str);
			}
			else {
				str="홀수다";
				System.out.println(str);
			}
		}
		
		System.out.println("--------");
	}
	
	//5
	public void inputTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		System.out.print("키를 입력해주세요: ");
		double height = sc.nextDouble();
		
		if(name !=null && name.length()>0 && age>0 && height >0 ) {
			System.out.println("이름: "+ name);
			System.out.println("나이: "+ age);
			System.out.println("키: "+ height);
			System.out.println("확인: "+name+"의 나이는 "+age+"세이고, 키는 "+height+" cm 이다.");
		}
		
		
		System.out.println("--------");
	}
	
	//6
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력해주세요: ");
		int num2 =sc.nextInt();
		
		if(num1>0 && num2>0) {
			System.out.println("첫번째 정수 : "+ num1);
			System.out.println("두번째 정수 : "+ num2);
			System.out.println(num1+ " + " + num2+ " = "+(num1+num2));
			System.out.println(num1+ " - " + num2+ " = "+(num1-num2));
			System.out.println(num1+ " * " + num2+ " = "+(num1*num2));
			System.out.println(num1+ " / " + num2+ " = "+(num1/num2));
			System.out.println(num1+ " % " + num2+ " = "+(num1%num2));
			
		}
		
		System.out.println("--------");
		
	}
	
	//7
	public void test7(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요: ");
		int score = sc.nextInt();
		
		char grade=0;
		if(score>=90) {
			grade='A';
		}
		else if(score>=80 && score<90) {
			grade='B';
		}
		else if(score>=70 && score<80) {
			grade ='C';
		}
		else if(score>=60 && score<70) {
			grade ='D';
		}
		else if(score<60) {
			grade = 'F';
		}
		
		System.out.println("점수: "+ score+ ", 학점: "+ grade);
		
		
		
	}
}
