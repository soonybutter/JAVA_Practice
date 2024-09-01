package com.test01;

public class WhileTest03 {
	
	public static void main(String[] args) {
		
		//1. 1~100 까지 숫자들 역순으로 출력
		prn01();
		
		//2. 1~100까지의 숫자 중 2의 배수만 출력
		prn02();
		
		//3. 1~100까지의 숫자 중 7의 배수의 갯수와 총합을 출력
		prn03();
		
	}
	
	public static void prn01() {
		
		/*
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("--------");
		*/
		
		int i=100;
		while(i>0) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("--------");
		
	}
	
    public static void prn02() {
    	
    	/*
    	for(int i=1; i<=100; i++) {
    		if( i%2 ==0) {
    			System.out.println(i);
    		}
    		
    	}
    	*/
    	
    	int i=1;
    	while(i<=100) {
    		if(i%2 ==0) {
    			System.out.println(i);
    		}
    		
    		i++;
    	}
    	
    	
    	System.out.println("--------");
		
	}

    public static void prn03() {
    	
    	int cnt=0;
    	int sum=0;
    	
    	for(int i=1; i<=100; i++) {
    		if(i%7==0) {
    			cnt++;
    			sum += i;
    			
    		}
    		
    	}
    	
    	System.out.println("개수: "+ cnt);
    	System.out.println("총 합: "+ sum);
	
    }

}
