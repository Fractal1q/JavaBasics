package com.syntax.class04;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner money=new Scanner(System.in);
		
		System.out.println("How much money you want?");
		
		int mon=money.nextInt();
		
		if(mon<200000) {
			System.out.println("I will give loan");
		} else {
			System.out.println("I reject");
		}
		
	}

}
