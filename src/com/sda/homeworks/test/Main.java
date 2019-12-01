package com.sda.homeworks.test;

public class Main {
	
	public static void main(String[] args) {
		// create  a Dog object and check if anything works fine
		Dog someDog = new Dog("Sheperd", 3, true, 20);
      
      System.out.println("getter for age: " + someDog.getAge());
      someDog.setWeight(-10);
	}
}
