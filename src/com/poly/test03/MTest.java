package com.poly.test03;

public class MTest {

	public static void main(String[] args) {
		
		Base b = new Cat();
		b.bark();
		b.eat("참치");
		
		b = new Dog();
		b.bark();
		b.eat("사료");

	}

}
