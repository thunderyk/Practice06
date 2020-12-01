package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] ceuArray = new User[3];
		
		ceuArray[0] = new Customer("jws","j1234","정우성",1000);
		ceuArray[1] = new Customer("yjs","y1234","이효리",2000);
		ceuArray[2] = new Employee("master","m7788","운영자",5000000);
		
		for(int i=0;i<ceuArray.length;i++) {
			ceuArray[i].showInfo();
		}
		
		System.out.println("운영자의 월급은 "+((Employee)ceuArray[2]).getSalary()+"원 입니다.");
	}

}
