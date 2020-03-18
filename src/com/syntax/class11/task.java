package com.syntax.class11;

public class task {

	public static void main(String[] args) {
		
		String[][] cars={
		                {"Ford","GM", "Jeep"},
		                {"Kia", "Hyudhai"},
		                {"Fiat", "Alfa Romeo", "Ferrary"}
		                };
       //get all values from 2D array

        //loop through rows

        for(int r=0; r<cars.length; r++) {
           //loop through columns
            for(int c=0; c<cars[r].length; c++) {

                System.out.print(cars[r][c]+" ");
		            }
		            System.out.println();
		        }
	}
}
