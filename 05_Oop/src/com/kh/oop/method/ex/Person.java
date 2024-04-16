package com.kh.oop.method.ex;

public class Person {
	
	//필드 이름 나이
	private String name;
	private    int  age;
	
	//필드 대신 값을 저장하고 내보내는 setter getter 생성
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	

	
	
}
