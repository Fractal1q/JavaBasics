package com.syntax.class06;

import java.util.Scanner;

public class food {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		
		String gr;
		String exp;
		
		
		System.out.println("Pleas enter grade");
		gr=inp.nextLine();
		
		switch(gr.toUpperCase()) {
		case "A":
			exp="Exellent";
			break;
		case "B":
			exp="Good";
			break;
		case "C":
			exp="Average";
			break;
		case "D":
			exp="Bad";
			break;
		default:
			exp="Not Acceptable";
			
		}
		System.out.println(exp);
	}
}
