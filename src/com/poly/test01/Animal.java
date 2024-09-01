package com.poly.test01;

//추상 클래스 : 추상 메소드를 0개 이상
public abstract class Animal {
	
	
	//추상메소드 -> 상속받는 class가 구현.
	public abstract void bark();
	
	public void eat(String ani) {
		System.out.println(ani + "먹는다.");
		
	}
	

}
