package com.syntax.class06;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
	 	System.out.println("enter 3 numbers");
	 	
	 	int num1=inp.nextInt();
	 	int num2=inp.nextInt();
	 	int num3=inp.nextInt();
	 	int l=0;
	 	
	 	
	 	if (num1>num2) {
	 		
	 		if (num1>num3) {
	 		l=num1;	
	 		} else {
	 			l=num3;
	 		}
	 	} else if (num2>num3){
	 		l=num2;
	 	} else {
	 		l=num3;
	 	}
	 	System.out.println("largest is "+l);
	}

}
