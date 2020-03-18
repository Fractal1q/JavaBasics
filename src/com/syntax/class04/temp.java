package com.syntax.class04;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner temp=new Scanner(System.in);
		
		System.out.println("Whats temperature in your city in F?");
		
		int mon=temp.nextInt();
		int c=(mon-32)*5/9;
			System.out.println("Temperature in Celsius is " + c);
		
		}
		
	}


