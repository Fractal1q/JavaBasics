package com.syntax.class07;

public class task {

	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			if(day<6) {
			System.out.print(day+" ");
			System.out.println("I need a day off");
			day++;
		}
			else if(day==6) {
			System.out.print(day+" ");
			System.out.println("I do not need day off any more");
			workDay=false;
		}
			

	}

}}
