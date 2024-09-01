package com.poly.test02;

public class Cat extends Base {
	
	
	@Override
	public void start() {
		System.out.println("고양이 걷는다.");
	}
	
	@Override
	public void stop() {
		System.out.println("고양이 멈췄다.");
	}
	
	//하위클래스 고유멤버
	public void test() {
		System.out.println("test()... ");
	}
	

}
