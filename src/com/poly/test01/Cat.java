package com.poly.test01;

public class Cat extends Animal{

	@Override
	public void bark() {
		System.out.println("야옹");
		
	}
	
	
	@Override
	public void eat(String ani) {
		super.eat(ani);
	}
	
	
}
