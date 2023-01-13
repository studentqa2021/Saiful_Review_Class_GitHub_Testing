package com.functional.test;

public class Employee {
	
	static String name ="Saiful";
	int salary = 5000;
	
	static void name() {
		System.out.println("Employee name is = "+ name);
	}
	void salary() {
		System.out.println("Saiful salary is = " + 5000);
		
	}
	

	public static void main(String[] args) {
	Employee.name();
	Employee obj =new Employee();
	obj.salary();

	}

}
