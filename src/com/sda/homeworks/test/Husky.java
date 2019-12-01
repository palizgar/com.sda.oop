package com.sda.homeworks.test;
// Husky is a child for Dog class
public class Husky extends Dog {
	
	public Husky(String name, int age, boolean isMale, double weight) {
		super(name, age, isMale, weight);
	}
	
	// Husky implementation of setWeight method
	@Override
	public void setWeight(double weight) {
	if (weight > 10){
		System.out.println("Your Husky is So Heavy");
		return;
	}
		System.out.println("Your Husky is on a Diet");
	}
}
