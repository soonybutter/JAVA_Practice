package com.poly.test04;

public class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	public void bite() {
		System.out.println("깨물다..");
	}
	
	@Override
	public void eat(String feed){
		System.out.println("강아지가"+ feed+"먹는다!");
	}

}
