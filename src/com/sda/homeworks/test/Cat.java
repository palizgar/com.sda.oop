package com.sda.homeworks.test;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public String yieldVoice() {
		return "Meow, Meow...";
	}
}
