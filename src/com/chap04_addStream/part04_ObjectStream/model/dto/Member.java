package com.chap04_addStream.part04_ObjectStream.model.dto;

import java.io.Serializable;

public class Member implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String userPw;
	private String userName;
	private int age;
	private char gender;
	private double point;
	
	private int grade;
	
	public Member() {
		super();
	}
	
	public Member(String userId, String userPw, String userName, int age, char gender, double point) {
		super();
		this.userId=userId;
		this.userPw=userPw;
		this.userName=userName;
		this.age=age;
		this.gender=gender;
		this.point=point;
	}
	
	public String getUserId(String userId) {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId= userId;
	}
	public String getUserPw(String userPw) {
		return userPw;
	}
	
	public void setUserPw(String userPw) {
		this.userPw= userPw;
	}
	public String getUserName(String userName) {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName= userName;
	}
	
	public int getAge(int age) {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public char getGender(char gender) {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender= gender;
	}
	
	public double getPoint(double point) {
		return point;
	}
	
	public void setPoint(char point) {
		this.point= point;
	}
	
	
	

}
