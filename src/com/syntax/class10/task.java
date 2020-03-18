package com.syntax.class10;

public class task {

	public static void main(String[] args) {
		String[] ani= {"wolf", "dog", "cat", "mouse", "lion", "tiger" };
		
		for(int i=0; i<6; i++) {
			System.out.println(ani[i]);
		}
		System.out.println("********************"
				);
		for(int i=0; i<ani.length; i++) {
			System.out.println(ani[i]);
		}
	}
}
