package com.functional.test;

public class Regression {
	
	 static int cookiesCount=10;
     
		static double money=20.75;
		
		static String name ="Saiful";
		
		static boolean status = false;
		
void practiceTest() {
	
	System.out.println(cookiesCount);
}

void practiceTest2() {
	
	System.out.println(money);
}

void practiceTest3() {
	System.out.println(name);
}

void practiceTest4() {
	System.out.println(status);
}

	public static void main(String[] args) {
		
		Regression obj = new Regression();
		obj.practiceTest();
		obj.practiceTest2();
		obj.practiceTest3();
		obj.practiceTest4();
		


	}

}
