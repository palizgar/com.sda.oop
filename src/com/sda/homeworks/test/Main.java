package com.sda.homeworks.test;

public class Main {
	
	public static void main(String[] args) {
	// demo of @override annotation
		
		Dog aHusky = new Husky("husky", 3, false, 10);
		// method binding
		aHusky.setWeight(8);
	}
	
	
}
