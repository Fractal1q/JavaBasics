package com.syntax.class04;

import java.util.Scanner;

public class dmv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner age=new Scanner(System.in);
		
		System.out.println("How old are you?");
		
		int mon=age.nextInt();
		
		if(mon>=18) {
			System.out.println("Driver license is issued");
		} else {
			System.out.println("Learner permit license is issued");
		}
		
	}

}
