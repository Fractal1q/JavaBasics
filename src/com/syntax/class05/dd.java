package com.syntax.class05;

import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
	 	
		System.out.println("Please enter day number");
		int h1=inp.nextInt();
 	
		if(h1==1 || h1==2 || h1==3 || h1==4 || h1==4 ) {
			System.out.println("It is weekday");
		} else if (h1==6 || h1==7) {
			System.out.println("It is weekend");			
		} else  {
			System.out.println("Invalid day");
	}

	}

}
