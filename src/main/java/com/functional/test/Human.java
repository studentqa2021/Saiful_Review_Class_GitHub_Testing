package com.functional.test;

public class Human {
	
	void run() {
		System.out.println("Joy can run");
		
	}
	
	static void sleep() {
		System.out.println("Joy can sleep");
		
	}
	

	public static void main(String[] args) {
	Human joy = new Human();
	joy.run();
	Human.sleep();

	}

}
