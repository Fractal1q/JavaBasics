package com.syntax.class07;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
	String t;
	String c=null;
	
		System.out.println("Please enter your favorite car make");
		t=inp.nextLine();
		
		switch(t) {
		
		case "BMW":
			c="german car";
			break;
		case "Toyota":
			c="japanese car";
			break;
			case "Maserati":
			c="italian car";
			break;
		
		
		default:
			System.out.println("unknown");
		}
		System.out.println("Your favorite car is " +c);
	}}