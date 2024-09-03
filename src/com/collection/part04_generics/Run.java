package com.collection.part04_generics;

public class Run {
	public static void main(String[] args) {
		String[] sarr = {"apple","melon","banana"};
		Integer[] iarr = {11,22,33,44,55};
	
		MyClass my = new MyClass();
		my.add(iarr);
		Integer[] i = (Integer[])my.get();
		
		MyClass<String> sMy = new MyClass<String>();
		MyClass<Integer> iMy = new MyClass<Integer>();
		
		sMy.add(sarr);
		iMy.add(iarr);
		String[] s = sMy.get();
		Integer[] ii = iMy.get();
		
	}

}
