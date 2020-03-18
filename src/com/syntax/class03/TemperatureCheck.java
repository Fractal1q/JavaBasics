package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		//Create variable to store temperature. Your program should check if temperature is below 32 
		//then it should print “Water will freeze with temperature __“, otherwise “Water will NOT 
		//freeze with temperature __“.

		int temp1=40;
		//int temp2=50;
		
		if(temp1<32) {
			System.out.println("Water will freeze with temperature is " + temp1);
			
		} else {
			System.out.println("Water will NOT reeze with temperature " +temp1);
		}
	}

}
