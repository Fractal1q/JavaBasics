package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		
		
		String today="Today is my favorite JAVA class";
		String[] array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite JAVA class";
		
		String[] a=today1.split("a");
		
		System.out.println(a.length);
		
		for(String arr:a) {
			System.out.println(arr+"  ");
			}
		for(String arr:a) {
			System.out.print(arr+" ");
			}
		System.out.println();
		System.out.println();
		String today2="Today is my favorite JAVA class";
		String[] words=today2.split(" ");
		for (int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		
		
	}
}
