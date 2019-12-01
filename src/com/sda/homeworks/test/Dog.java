package com.sda.homeworks.test;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AnyURIDV;
public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public String yieldVoice() {
		return "Barking...";
	}
}
