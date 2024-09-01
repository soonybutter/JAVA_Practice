package com.chap02.throwsPrac;

import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		try {
			//예외발생할 수 있는 코드를 포함한 실행코드를 작성
			String s = null;
			s.length();  //에외
			
			methodA();
		}
		catch(IOException e){
			//해당 예외가 발생했을때 실행할 코드를 작성
			System.out.println(e.getMessage());
			System.out.println("main()에서 처리");
			
		}
		catch(NullPointerException e) {
			System.out.println("널포인터");
		}
		catch(RuntimeException e) {
				
		}
		finally {
			//예외가 발생했든, 정상적으로 동작을 했던 간에 무조건 실행
			System.out.println("finally 실행!");
			
		}
		
		System.out.println("끝!!");
		
		
	}
	
	public static void methodA() throws IOException  {
		
		methodB();
		
	}
	
	public static void methodB() throws IOException {
		
		methodC();
		
	}
	
    public static void methodC() throws IOException{
    	/* try catch로 오류해결..
    	try {
    		
    	    throw new IOException();
    	}
    	catch(IOException e){
    		e.printStackTrace();
    		
    	}
    	*/
    	
    	throw new IOException();
    	
	}

}
