package com.syntax.class05;

import java.util.Scanner;

public class hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp =new Scanner(System.in);
	 	
		System.out.println("Please enter your height in inches");
		int h1=inp.nextInt();
 	
		if(h1<60) {
			System.out.println("Short");
		} else if (h1>=60 && h1<=72) {
			System.out.println("Medium");			
		} else if (h1>72) {
			System.out.println("tall");
	}

}
}
