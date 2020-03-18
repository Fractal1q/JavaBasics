package com.syntax.class11;

public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] co= {
				{"USA","Mexico", "Canada"},
                {"Equador", "Venesuela", "Columbia", "Brazil"},
                {"Moroco", "Egipt", "Gana"}
                };
		
		for (String[] a:co) {
			for (String b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}

}
