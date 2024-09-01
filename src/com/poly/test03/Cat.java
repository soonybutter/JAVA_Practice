package com.poly.test03;

//인터페이스 상속-> implements 키워드 사용
public class Cat implements Base, Test{
	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	@Override
	public void eat(String ani) {
		System.out.println(ani + "먹는다");
		
	}
	

}
