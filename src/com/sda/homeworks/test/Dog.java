package com.sda.homeworks.test;

public class Dog {
	private String name;
	private int age;
	private boolean isMale;
	private double weight;
	
	public Dog(String name, int age, boolean isMale, double weight) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		this.weight = weight;
	}
	
	public Dog(int age) {
		Dog aDog = new Dog("aName",20,false,60.5);
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	// Dog implementation of setWeight method
	public void setWeight(double weight) {
		if (weight<= 0) {
			System.out.println("wrong weight in Dog class");
			return;
		}
		System.out.println("right weight in Dog class");
		this.weight = weight;
	}
}
