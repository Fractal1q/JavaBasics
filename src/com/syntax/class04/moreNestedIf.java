package com.syntax.class04;

public class moreNestedIf {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		boolean alergy=true;
		boolean appleAlergy=false;
		boolean orangeAlergy=true;
		boolean kiwiAlergy=false;
		
		if(alergy) {
			System.out.println("Please answer below");
			
			if(orangeAlergy) {
				System.out.println("Do not eat oranges");
			}
		} else {
			System.out.println("You are healthy");
		}
		
	}
	
}
