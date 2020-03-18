package com.syntax.class08;

import java.util.Scanner;

public class task22 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
	int a;
	int b;
	
	int big=0;
	int small=0;
	
	int s=0;
	int s2=0;
	
	System.out.println("Please give 2 numbers");
	a=inp.nextInt();
	b=inp.nextInt();

	if(a>b) {
		big=a;
		small=b;
	} else {
		big=b;
		small=a;
	}

	
	
	for(int i=small; i<=big; i++) {
		//System.out.println(i);
		if(i%2==0) {
			continue;
		}
		s=s+i++;
		
		}
	for(int i=small; i<=big; i++) {
		//System.out.println(i);
		if(i%2!=0) {
			continue;
		}
		s2=s2+i++;
		
		}
	System.out.println(s);
	System.out.println(s2);
	}

}
