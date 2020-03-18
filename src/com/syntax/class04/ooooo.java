package com.syntax.class04;

import java.util.Scanner;

public class ooooo {

	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	Scanner inp2 = new Scanner(System.in);
	 
		System.out.println("Please enter your age");
		int age = inp.nextInt();
		System.out.println("Please enter your gender: M or F");
		String gen=inp2.nextLine();
		
	
			if(age>25){
				
				  	if(gen.equals("F")){
				  	  System.out.println("Women");
				  	} else {
				  	  System.out.println("Man");
				  	}
			} else {
			  	if(gen.equals("F")){
				  	  System.out.println("Girl");
				  	} else{
				  	  System.out.println("Boy");
				  	}
			}
	}}

