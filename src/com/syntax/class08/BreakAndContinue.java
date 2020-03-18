package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<+10; i++) {
			
			if(i==4) {
				System.out.println("haha");
				continue;
			}
			
			System.out.println("I am inside of loop");
			
		}
			System.out.println("************************");
		
	
		for(int u=1; u<+10; u++) {
			
			if(u==4) {
				System.out.println("haha");
				break;
			}
			
			System.out.println("I am inside of loop");
		
		
	}
}}
