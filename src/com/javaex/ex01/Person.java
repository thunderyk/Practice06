package com.javaex.ex01;

public class Person {
	
	private String name;
	private String hp;
	//자식에서도 접근을 못하게 하기 위해 private로 설정
	//자식에서도 접근하려면 get이나 set을 사용해야함
	
	Person(){
		
	}
	Person(String name, String hp){
		this.name = name;
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected void setHp(String hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.println("#이름: "+name+", #핸드폰: "+hp);
	}
	
	
}
