package com.syntax.class10;

public class dimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] mon = { {"January", "February", "December"},
							{"March", "April", "May"},
							{"June", "July", "August"},
							{"September", "October", "November"} };
		
		System.out.println(mon[1][1]);
		System.out.println();
		
		for(int i=0; i<mon.length; i++) {
			for(int j=0; j<mon[i].length; j++) {
				System.out.println(mon[i][j]);
			}
		}
			
	}

}
