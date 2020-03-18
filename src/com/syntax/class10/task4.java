package com.syntax.class10;

public class task4 {

	public static void main(String[] args) {
		
		int[] num = {200, 30, -1, 900, 56, 787};
		int largest=num[0];
		
		for(int i=0; 1<num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
				System.out.println(largest);
			}
		
		}
		
}
}
