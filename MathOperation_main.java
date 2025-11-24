package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class MathOperation_main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		//read inputs
		int x=scanner.nextInt();
		//parent to child access
		MathOperation mo=new Square();
		System.out.println(mo.operator(x));
	}

}
