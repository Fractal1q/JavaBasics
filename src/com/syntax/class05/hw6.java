package com.syntax.class05;

import java.util.Scanner;

public class hw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
	 	System.out.println("How much are eyour sales in $?");
	 	
		double h1=inp.nextDouble();
		double com=0.0;
		
		if(h1>=1 && h1<=100) {
			com=h1*0.1;
		} else if (h1>=101 && h1<=200) {
			com=h1*0.2;
		} else if (h1>=201 && h1<=500) {
			com=h1*0.3;
		} else if (h1>500) {
			com=h1*0.5;
		} 
		System.out.println("Your commision is $"+com);
		
		if (com>100) {
			System.out.println("You are awesome seller");
		}
}
}
