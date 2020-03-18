package com.syntax.class11;

import java.util.Scanner;

public class asdasd {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		String username;
		String password;
		String password1;
		
		System.out.println("Please enter username");
		username = inp.nextLine();
		System.out.println("Please enter password");
		password = inp.nextLine();
		
		
		
		if (!(username.isEmpty() || password.isEmpty())) {
			if (password.length()<8 ){
				if (password.length()>=8 ){
					if (!password.contains(username)) {
						System.out.println("Please confirm password");
						password1 = inp.nextLine();
						if(!password.equals(password1)) {
							System.out.println("Your username and password has been created");
						} else {
							System.out.println("Passwords do not match");
						}
					} else {
						System.out.println("Password cannot contain username");
					}
				} else {
					System.out.println("Password is too short");
				}
			}
		} else {
			System.out.println("Username and Password cannot be empty");
		}
		
	}

}


