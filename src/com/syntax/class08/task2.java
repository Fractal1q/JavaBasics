package com.syntax.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String c=null;
		
		for (int i=1; i<=10; i++) {
			System.out.println("Please apply for a CC");
			c=inp.nextLine();
			if(c.equalsIgnoreCase("yes")) {
				break;
			}
			
			
		}

	}

}
