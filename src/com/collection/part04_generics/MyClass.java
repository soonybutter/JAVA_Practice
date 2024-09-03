package com.collection.part04_generics;

public class MyClass<T> {
	private T[] array;
	

	public void add(T[] array) {
		this.array = array;
		
	}
	
	public T[] get() {
		return array;
	}
	
	

}


