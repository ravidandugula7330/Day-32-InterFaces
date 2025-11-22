package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class Main_PaawordChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a password");
		//read inputs
		String password=scanner.nextLine();
		PasswordChecker simpleChecker=new SimplePasswordChecker();
		System.out.println(simpleChecker.checkLength(password));
		System.out.println(simpleChecker.checkComplexity(password));
		scanner.close();
	}

}
