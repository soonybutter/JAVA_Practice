package com.silsub1;

import java.util.Scanner;

public class ForWhile 
{
	
	Scanner sc = new Scanner(System.in);
	//1
	public void pointStar1() 
	{
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num>0) 
		{
			for(int i=1; i<=num; i++) 
			{
				for(int k=1; k<=num; k++) 
				{
					
					if(i==k) 
					{
						System.out.print(i);
						break;
					}
					else 
					{
						System.out.print("*");
					}
					
					
				}
				System.out.println();
			}
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
	}
	//2
	public void pointStar2() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=0; i<num; i++) {
				for(int k=0; k<i+1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(num<0) {
			for(int i=0; i<Math.abs(num); i++) {
				for(int k=Math.abs(num)-i; k>0; k--) {
					System.out.print("*");
					
				}
				System.out.println();
			}
		}
		else if(num==0) {
			System.out.println("출력 기능이 없습니다.");
		}
	}
	//3
	public void countInputCharacter() {
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		System.out.print("문자 입력: ");
		String ch = sc.nextLine();
		char c = ch.charAt(0);
		
		int cnt=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)== c) {
				cnt++;
				
			}
		}
		
		
		
		System.out.print("포함된 갯수:"+ cnt+" 개");
		
		
		
		
	}

}
