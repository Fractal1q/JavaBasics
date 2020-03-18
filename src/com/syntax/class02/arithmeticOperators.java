package com.syntax.class02;

public class arithmeticOperators {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 10;

		double num3 = 10.99;
		double num4 = 11.99;

		int sum = num1 + num2;
		double sum1 = num3 + num4;
		double sum3 = num1 + num3;

		int sub = num1 - num2;

		int mult = num1 * num2;

		int div = num1 / num2;

		// result of division is=___

		/*
		 * System.out.println("The result of division is "+ div);
		 * System.out.println("The result of division is "+ sum);
		 * System.out.println("The result of division is "+ sum3);
		 * System.out.println("The result of division is "+ mult);
		 */

		// Write a Java program to add, subtract, multiply and divide 2 decimal values.
		// Your program should say. “The _______ of 2 numbers ___ and ___ is equal to
		// _____”

		System.out.println("The sum of 2 numbers " + num1 + " and " + num2 + " is equal to " + sum);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);
		System.out.println("The product of 2 numbers " + num1 + " and " + num2 + " is equal to " + mult);
		System.out.println("The substraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);

		double num5 = 3.9;
		double sq = num5 * num5;
		// Write a program to find the square of the number 3.9.
		// You program should say “The square of the ____ is ____ ”
		System.out.println("The square of the " + num5 + " is " + num5 * num5 + " or " + sq);

		// Write a program to print the area and perimeter of a rectangle with width = 5
		// and
		// height = 8. Your program should say. “The perimeter of a rectangle with width
		// ___
		// and height ____ is equal to _____ and the area is __”

		int num6 = 5;
		int num7 = 8;
		int per = num6 + num7 + num6 + num7;
		int area = num6 * num7;

		System.out.println("The perimeter of a rectangle with width  " + num6 + " and height " + num7 + " is equal to "
				+ per + " and the area is " + area);

	}

}
