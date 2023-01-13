package com.functional.test;



public class Animal {
	
	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.run();
		tiger.eat();
		tiger.sleep();
	}

	String color = "Black";
	int legs = 4;
	
	void run() {
		System.out.println("Tiger can run");
	}
	
	void eat() {
		System.out.println("Tiger can eat");
	}
	
void sleep() {
	System.out.println("Tiger can sleep");
}
	

}
