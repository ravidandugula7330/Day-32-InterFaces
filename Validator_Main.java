package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class Validator_Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//enter input value
		System.out.println("Enter a value");
		//read input number
		int num=scanner.nextInt();
		//parent to child access
		Validator v=new positiveNumberValidator();
		if(v.isValid(num)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
	}

}
