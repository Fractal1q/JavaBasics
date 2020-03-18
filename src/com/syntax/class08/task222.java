package com.syntax.class08;

import java.util.Scanner;

public class task222 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a=0;
		int p=0;
		int s=0;
		String item=null;
		
		
		System.out.println("enter item");
		System.out.println("enter price");
		item=inp.nextLine();
		a=inp.nextInt();
		
		while (s<a) {
			System.out.println("Please pay");
			p=inp.nextInt();
			s=s+p;
			
		}
		System.out.println("Thank you for shopping!");
		System.out.println("your change is " +(s-a));
	}

}
