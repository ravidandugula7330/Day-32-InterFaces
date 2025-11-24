package com.codegnan.oop.interfaces;

import java.util.Scanner;

class Calculator_main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the inputs");
		//read inputs
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		//object creation for parent to child
		Calculator c=new BasicCalculator();
		int result=c.add(a, b);
		System.out.println(result);
		

	}

}
