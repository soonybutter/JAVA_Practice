package com.poly.test05;

import java.util.Scanner;

public class Square extends AreaImPl {
	
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력: ");
		int x = sc.nextInt();
		System.out.print("세로 입력: ");
		int y = sc.nextInt();
		
		int res = x*y;
		
		
		setRes(String.valueOf(res));
		
		
	}
	

}
