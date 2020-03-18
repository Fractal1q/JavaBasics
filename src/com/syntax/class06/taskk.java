package com.syntax.class06;

import java.util.Scanner;

public class taskk {

	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
	char gender;
	String genderType;	
	
		System.out.println("please enter your gender: M or F");
		gender=inp.next().charAt(0);
		
		switch(gender) {
		
		case 'M':
			genderType="Male";
			break;
		case 'F':
			genderType="Female";
		break;
		
		default:
			genderType="unknown";
		}
		System.out.println(genderType);
		}
		
	}