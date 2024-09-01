package com.test01;

public class SwitchTest01 {
	public void test1() {
		int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("다른 숫자입니다.");
			
		}
		
	}
	
	public void test2() {
		char ch = 'd';
		
		switch(ch) {
		case'a':
			System.out.println("a입니다.");
			break;
		case'b':
			System.out.println("b입니다.");
			break;
		case'c':
			System.out.println("c입니다.");
			break;
		
		default:
			System.out.println("다른 영어 입니다.");
		}
		
	}
	
	public void test3() {
		String str = "한국";
		
		switch(str) {
		case "한국":
			System.out.println("Kr");
			break;
		case "미국":
			System.out.println("us");
			break;
		case "일본":
			System.out.println("jp");
			break;
		default:	
			System.out.println("다른 나라입니다.");
			
		}
		
		int i=3;
		switch(i) {
		case 1:
		case 3:
			System.out.println("홀수");
			break;
		case 2:
		case 4:
			System.out.println("짝수");
			break;
		default:
			System.out.println("다른 숫자");
		}
		
	}
	
	

}
