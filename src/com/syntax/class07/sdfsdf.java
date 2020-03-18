package com.syntax.class07;

import java.util.Scanner;

public class sdfsdf {

	
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		int h1=0;
	 	String com=null;
	 	
	 	System.out.println("Please enter your mark");
	 	h1=inp.nextInt();
	 	
	 
	 	  
	 	  
	 	  if(h1>80) {
			com="A";
		} else if (h1>60 && h1<=80) {
			com="B";
		} else if (h1>50 && h1<=60) {
			com="C";
		} else if (h1>45 && h1<=50) {
			com="D";
		} else if (h1>25 && h1<=45) {
			com="E";
		} else if (h1>1 && h1<=25) {
			com="F";
	 	  System.out.println("Your grade is "+com);
	 	} else {
	 	  	System.out.println("Please enter valid mark");
	 	}
	 	
	 	 System.out.println("Your grade is "+com);
	 	
	}}

