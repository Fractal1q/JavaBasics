package com.syntax.class11;

public class active {
	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		int k=0;
		 for(int r=0; r<a.length; r++){
		   for(int c=0; c<a[r].length; c++)
			   
		   if(r%2==0 && c%2==0){
			   int y=a[r][c];
		     k=k+y;
		   }
		   
		 }
		 System.out.println(k);

		
	}
}