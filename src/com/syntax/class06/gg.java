package com.syntax.class06;

import java.util.Scanner;

public class gg {

	
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double price=0.0;
		double discount=0.0;
		double finalPrice=0.0;
		
		System.out.println("Is there a sale?");
		String sale=inp.nextLine();
		
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What is a price of item?");
			price=inp.nextDouble();
			
			if (price<20) {
				discount=10;
			} else if (price>20 && price<=100) {
				discount=20;
			} else if (price>100 && price<=500) {
				discount=30;
			} else if (price>500) {
				discount=50;
			} 
			finalPrice=price-(price*discount/100);
			System.out.println("after " +discount+"% dicount the price is reduced from "+price+" to "+finalPrice);
		} else {
			System.out.println("not Sopping");
		}
		 	
	}


	}

			