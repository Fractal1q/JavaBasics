package com.syntax.class03;

public class additionVsConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hi";
		String b="bye";
		
		int x=10;
		int y=20;
		
		System.out.println(a+b+x+y);
		System.out.println(x+b+a+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		int num=100;
		num+=50;
		
		System.out.println(num);
				
				
	}

}
