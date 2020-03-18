package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean diploma=true;
		double gpa=3.5;
		
		if(diploma) {
			System.out.println("congratulations");
			if (gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Get a gegree");
		}

	}

}
