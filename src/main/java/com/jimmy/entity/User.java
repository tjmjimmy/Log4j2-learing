package com.jimmy.entity;

public class User {

	//登录名
	private	String name;
	//身份证姓名
	private String crtName;
	//身份证号码
	private String crtNumber;

	public User(){}
	
	public User(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrtName() {
		return crtName;
	}

	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}

	public String getCrtNumber() {
		return crtNumber;
	}

	public void setCrtNumber(String crtNumber) {
		this.crtNumber = crtNumber;
	}
	
	
}
