package com.syntax.class11;

public class task1 {

	public static void main(String[] args) {
	String[][] country={
			                {"USA","Mexico", "Canada"},
			                {"Equador", "Venesuela", "Columbia", "Brazil"},
			                {"Moroco", "Egipt", "Gana"}
			                };
	int t=0;

	        for(int r=0; r<country.length; r++) {
	          
	            for(int c=0; c<country[r].length; c++) {

	                System.out.print(country[r][c]+" ");
	                t=t+1;
			            }
			            System.out.println();
			            
			            
			        }
	        System.out.println(t);
		}
	}