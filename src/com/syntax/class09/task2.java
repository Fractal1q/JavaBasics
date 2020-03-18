package com.syntax.class09;

public class task2 {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			for(int y=5; y>=i; y--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int y=1; y<=i; y++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=5; i>=1; i--) {
				for(int y=1; y<=i; y++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}

	}


