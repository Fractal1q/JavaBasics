package com.syntax.class12;

import java.util.Scanner;

public class active {

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine(); 
		    
		    		if(browser.equalsIgnoreCase("chrome")) {
					  System.out.println("Proceed with Chrome browser");
				  } else if (browser.equalsIgnoreCase("FireFOX ")) {
					  System.out.println("Proceed with Firefox browser");
				  } else if (browser.equalsIgnoreCase("IE")) {
					  System.out.println("Proceed with IE browser");
				  } else {
					  System.out.println("Invalid browser");
				  }
				  }
				}