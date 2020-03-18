package com.syntax.class09;

public class array {

	public static void main(String[] args) {
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		System.out.println(array[1]);
		
		
		String[] carArray;
		carArray=new String[4];
				
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		carArray[3]="Seat";
		
		System.out.println("I am driving "+carArray[2]);
		
		int[] numbers =new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		//reassign
		numbers[1]=2000;
		
		System.out.println(numbers[1]);
		System.out.println(numbers[1]+numbers[2]);
		System.out.println();
		
		double[] num1={10.9, 52.99, 55};
		System.out.println(num1[2]);
		
		

	}

}
