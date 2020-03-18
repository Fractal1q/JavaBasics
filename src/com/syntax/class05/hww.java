package com.syntax.class05;

import java.util.Scanner;

public class hww {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner inp =new Scanner(System.in);
		 	System.out.println("Enter your birth month");
		 	
		 	String mon=inp.nextLine();
		 	String ses="mistake";


			if(mon.equalsIgnoreCase("January") || mon.equalsIgnoreCase("february") || mon.equalsIgnoreCase("december")) {
				ses="Winter";
			} else if (mon.equalsIgnoreCase("march") || mon.equalsIgnoreCase("april") || mon.equalsIgnoreCase("may")) {
				ses="spring";
			} else if (mon.equalsIgnoreCase("june") || mon.equalsIgnoreCase("july") || mon.equalsIgnoreCase("august")) {
				ses="summer";
			} else if (mon.equalsIgnoreCase("september") || mon.equalsIgnoreCase("october") || mon.equalsIgnoreCase("november")) {
				ses="Fall";
			} 
			System.out.println("You were born in " +ses);
			}
	}
