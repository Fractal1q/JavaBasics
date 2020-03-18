package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		// Declare a number and compare if number is larger then 100
		
		System.out.println("Strarting coding");
		int num=178;
		if (num>1000) {
			System.out.println("My number is large");
		}

		System.out.println("End of the program.");
		
		System.out.println("---------------------------");
		
		int expactedHours=15;
		int actualHours=15;
		
		if (actualHours>=expactedHours) {
			
			System.out.println("You love java");
		}else { 
			System.out.println("You will not like java");
		}
		
		System.out.println("---------------------------------------------");
		
		double budget=100000;
		double carPrice=10000;
		
		if(budget>carPrice) {
			System.out.println("I will buy a car today");
			System.out.println("I will be happy");

		}else {
			System.out.println("I wil not buy this car today. I will go learn Java.");
		}
		
		System.out.println("I am a code after if condition.");
		
	}

}
