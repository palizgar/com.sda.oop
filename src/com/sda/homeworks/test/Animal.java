package com.sda.homeworks.test;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String yieldVoice(){
		return "inside animal yieldVoice()";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
