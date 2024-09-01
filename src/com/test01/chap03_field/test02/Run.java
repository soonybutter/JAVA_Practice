package com.test01.chap03_field.test02;

public class Run {

	public static void main(String[] args) {

		InitField op = new InitField();
		//op.setName("orange");
		//op.setPrice(4000);
		//op.setBrand("korea");
		op.info();
		op.setName("iphone");
		op.setPrice(2500000);
		op.setBrand("apple");
		
		
		InitField op1 = new InitField("flip",2000000,"samsung");
		op1.info();
		op.info();
		
	}

}
