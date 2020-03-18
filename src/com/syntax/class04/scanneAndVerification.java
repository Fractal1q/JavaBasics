package com.syntax.class04;

import java.util.Scanner;

public class scanneAndVerification {

	public static void main(String[] args) {
		/*capture 2 numbers
		 * compare which is larger
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		
		int num1=input.nextInt();
		
		System.out.println("Please enter the second number");
		
		int num2=input.nextInt();
		
		//System.out.println("Please enter the second number");
		
		if (num1>num2) {
			System.out.println(num1 +" is larger then " + num2);
		} else {
			System.out.println(num1 +" is not larger then " + num2);
		}
	}
}
