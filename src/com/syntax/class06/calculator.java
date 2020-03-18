package com.syntax.class06;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
		Scanner inp2=new Scanner(System.in);
		
		int num1;
		int num2;
		char op;
		int out;
		
		System.out.println("enter number 1");
		num1=inp.nextInt();
		System.out.println("enter operator");
		op=inp2.next().charAt(0);
		System.out.println("enter number 2");
		num2=inp.nextInt();
		
		switch(op){
			case '+':
		out=num1+num2;
				break;
			case '-':
				out=num1-num2;
				break;
			case '*':
				out=num1*num2;
				break;
			case '/':
				out=num1/num2;
				break;
			default:
				System.out.println("mistake");
				out=-1919191;
				
				}	
		System.out.println("Result is "+out);
	}

}
