package com.syntax.class07;

import java.util.Scanner;

public class dfgdfgdfg {

	
	public static void main(String[] args) {
	Scanner inp =new Scanner(System.in);
 	
 	
	int num1;
 	int num2;
 	String st1=null;
 	String st2=null;
 	
 	System.out.println("Please enter two strings");
 	System.out.println("Please enter two numbers");
 	num1=inp.nextInt();
 	num2=inp.nextInt();
 	st1=inp.nextLine();
 	st2=inp.nextLine();
 	
 	if(num1==num2 && st1.equals(st2)) {
 		System.out.println("AND");
 	} else if (num1==num2 || st1.equals(st2)) {
 		System.out.println("OR");
 	} else if (num1!=num2 && !st1.equals(st2)) {
 		System.out.println("OR");
 	}
 
 	
 	
	}}