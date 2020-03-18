package com.syntax.class05;
import java.util.Scanner;
public class MoreLogicalOperators {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		
		int day=1;
		String day1="Tuesday";
		
		if(day1.equals("Tueasday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC");
		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is JAVA class");			
		} else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("Today is no class");			
		} else if (day1.equals("Friday")) {
			System.out.println("Today is SDLC");			
		}



	}

}
