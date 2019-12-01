package com.sda.homeworks.test;

public class Son extends Dad{
	private double age = 17;
	
	public Son(String name) {
		super(name);  // create son instance
	
	}
	
	public void callMe(){
	System.out.println("I am the son with age: " + this.age);
		int anotherAge = getAge();
		System.out.println("anotherAge is = " + anotherAge);
	}
}
