package com.syntax.class04;

import java.util.Scanner;
public class home {
	
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
 
 
	System.out.println("Please enter your age");
	int age = inp.nextInt();
	System.out.println("Please enter your gender: M or F");
	String gen=inp.nextLine();
	
    
		if(age>25){
			
			  	if(gen=="M"){
			  	  System.out.println("Man");
			  	} else if (gen=="W"){
			  	  System.out.println("Woman");
			  	}
		} else if (age<=25){
		  	if(gen=="M"){
			  	  System.out.println("Boy");
			  	} else if (gen=="W"){
			  	  System.out.println("Girl");
			  	}
		}
	}}