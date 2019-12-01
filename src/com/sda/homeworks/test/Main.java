package com.sda.homeworks.test;

public class Main {
	
	public static void main(String[] args) {
		Dog aDog = new Dog("Rex");
		Cat aCat = new Cat("LadyGaga");
		Animal[] array = new Animal[2];
		array[0] = aDog;
		array[1] = aCat;
		for(Animal i:array){
			System.out.println(i.getName() + " yields like " + i.yieldVoice());
		}
	}
	
	
}
