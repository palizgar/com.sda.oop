package com.sda.homeworks.test;

public class Dad {
	private String name;
	private int age = 48;
	public Dad(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void callMe(){
		System.out.println("I am the Dad with age: " + this.age);
	}
	
	public int getAge() {
		System.out.println("getAge method in Dad class");
		return age;
	}
}
