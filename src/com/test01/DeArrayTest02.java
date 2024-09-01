package com.test01;

public class DeArrayTest02 {
	public void test1() {
		//구구단을 2차원 배열에 넣어보자.
		
		int arr [][]= new int[8][9];
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				arr[i][k]= (i+2)*(k+1);
			}
		}
		
		new DeArrayTest01().printArray((arr));
		
		//print(arr);
	}
	
	
	public void print(int arr[][]) {
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void test2() {
		//5x5 2차원 배열 생성 
		//생성한 2차원 배열에 값을 대입.
		/*
		 1 6 11 16 21 
		 2 7 12 17 22 
		 3 8 13 18 23 
		 4 9 14 19 24 
		 5 10 15 20 25 
		 
		  */
		
		int arr[][] = new int[5][5];
		
		int num =1;
		
		for(int i=0; i< 5; i++) {
			for(int k=0; k<5; k++) {
				arr[k][i] = num;
				num++;
			}
		}
		
		new DeArrayTest01().printArray(arr);
		
	}

}
