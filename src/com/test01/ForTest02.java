package com.test01;

import java.util.Scanner;

public class ForTest02 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//testFor1();
		//testFor2();
		//testFor3();
		testFor4();

	}
	
	public static void testFor1() {
		//중첩 반복문
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<5; j++) {
				
				System.out.println("i="+i+", j="+j);
			}
		}
		
	}
	
	public static void testFor2() {
		//구구단 2단부터 9단까지 출력
		
		for(int i=2; i<=9; i++) { 
			
			for(int k=1; k<=9; k++) {
				
				System.out.println(i + " * "+ k +" = "+ i*k);
			}
		}
	}
	
	public static void testFor3() 
	{
		System.out.print("출력할 줄 수: ");
		int row = sc.nextInt();
		
		for(int j=0; j<row; j++) 
		{
			for(int k=0; k<5; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
	}
	
	public static void testFor4() {
		System.out.print("줄 수: ");
		int row = sc.nextInt();
		System.out.print("칸 수: ");
		int col = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int k=1; k<=col; k++) {
				
				if(i==k) {
					System.out.print(i);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
