package com.syntax.class05;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
	 	System.out.println("Enter your quiz score");
	 	double h1=inp.nextDouble();
	 	System.out.println("Enter your mid term score");
	 	double h2=inp.nextDouble();
	 	System.out.println("Enter your final score");
	 	double h3=inp.nextDouble();
		
		double ave=0.0;
		ave = (h1+h2+h3)/3;
		
		String grade="Mistake in onput";
		
		if(ave>=90 && ave<110) {
			grade="A";
		} else if (ave>=70 && ave<90) {
			grade="B";
		} else if (ave>=50 && ave<70) {
			grade="C";
		} else if (ave<50) {
			grade="F";
		} 
		System.out.println("Your grade is: " +grade);
		}
}
