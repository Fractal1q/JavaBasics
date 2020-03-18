package com.syntax.class11;

import java.util.Scanner;

public class classTask {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		String username;
		String password;
		String password1;
		
		System.out.println("Please enter username");
		username = inp.nextLine();
		System.out.println("Please enter password");
		password = inp.nextLine();
		System.out.println("Please confirm password");
		password1 = inp.nextLine();
		
		
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else if (password.length()<8 ){
			System.out.println("Password is too short");
		} else if (password.contains(username)) {
			System.out.println("Password cannot contain username");
		} else if(!password.equals(password1)) {
			System.out.println("Passwords do not match");
		} else {
			System.out.println("Your username and password has been created");
		}
	}

}
