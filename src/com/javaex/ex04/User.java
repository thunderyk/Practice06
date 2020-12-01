package com.javaex.ex04;

public class User {
	
	protected String id;
	protected String password;
	protected String name;
	
	public User() {
		
	}
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public void showInfo(){
		System.out.println("#아이디:"+id+", #패스워드: "+password+", #이름: "+name);
	}
	
	
	
}
