package com.syntax.class05;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp =new Scanner(System.in);
		 	
		System.out.println("Please enter your age");
		int age=inp.nextInt();
 	
		if(age>=1 && age<=3) {
			System.out.println("You are baby");
		} else if (age>=4 && age<=5) {
			System.out.println("You are a kid");			
		} else if (age>=6 && age<=12) {
			System.out.println("You are a child");
		}else if (age>=13 && age<=19) {
			System.out.println("You are a teenager");	
		} else if (age>=20 && age<=65) {
		System.out.println("You are adult");	
		}else {
			System.out.println("You are a enjoy life");	
		}
	}
}
