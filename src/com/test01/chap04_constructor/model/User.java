package com.test01.chap04_constructor.model;

import java.util.Date;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date date;

	//생성자 사용시 주의사항
	//1. 반드시 클래스명과 동일(대/소문자 구분)
	//2. 리턴타입이 존재하지 않는다.(void, int, char, ...)
	
	//기본생성자
	public User(){}
	
	//매개변수 생성자
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		//지역변수와 필드의 이름이 동일한 경우 지역변수가 우선시 된다.
		//그래서 this. 을 명시하여 필드를 구분!
	
	}
	
	public User(String userId, String userPwd, String userName, Date date) {
		//this.userId = userId;
		//this.userPwd = userPwd;
		//this.userName = userName;
		//this() -> 클래스 안에 다른 생성자 호출
		this();
		this.date = date;
		
	}
	
	//getter/setter
	public String getUserId() {
		//getter메소드 작성
		//접근제한자 : public
		//리턴타입 : 필드의 타입
		//메소드명 : get+필드명(필드명의 첫글자를 대문자)
		//리턴값 : 필드에 저장된 값
		return userId;
	}
	
	public void setUserId(String userId) {
		//setter메소드 작성
		//접근제한자 : public
		//리턴타입 : void
		//메소드명: set+필드명(필드명의 첫글자를 대문자)
		//매개변수 : 필드와 동일한 타입의 매개변수
		this.userId= userId;
		
		
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getdate() {
		return userName;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	//출력용 메소드
	public void info() {
		System.out.println(userId+", "+userPwd+", "+userName+", "+date);
	}
	
	
	
	
	
}
