package com.poly.test05;

public abstract class AreaImPl implements Area {
	
	private String res;
	
	@Override
	public void print() {
		System.out.println(Area.print + res);
		
	}
	
	public void setRes(String res) {
		this.res = res;
	}
	
	
	
	

}
