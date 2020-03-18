package com.syntax.class12;

public class task {

	public static void main(String[] args) {
		String str1="This is my sentence.";
		System.out.println(str1);
		System.out.println();
		
		str1=str1.replaceAll(" ", "");
		
		System.out.println(str1);

		System.out.println();
		System.out.println();
		System.out.println();
		
		
		String str2="This is 555 ***";
		System.out.println("total "+str2.length());
		str2=str2.replaceAll("[^A-Za-z]", "");
		System.out.println("alfa "+str2.length());
		
		String str3="Is it saturday? Is it raining? Do we have a Java Class today?";
		str3=str3.replace("?", "!");
		String[] st=str3.split("!");
		
		System.out.println(st.length);

	}

}
