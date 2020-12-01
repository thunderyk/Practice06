package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo;
	private int point;
	
	Customer(){
		
	}
	Customer(String name, String hp, int cNo, int point){
		super.setName(name);
		super.setHp(hp);
		this.cNo = cNo;
		this.point = point;
	}
	public int getcNo() {
		return cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void showInfo() {
		System.out.println("#이름: "+super.getName()+", #핸드폰: "+super.getHp()+", #고객번호: "+getcNo()+", #포인트점수: "+getPoint());
	}

	
}
