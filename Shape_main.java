package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class Shape_main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string name(ingore) ");
		//dummy
		scanner.nextLine();
		//parent to child
		Shape s=new Circle();
		System.out.println(s.getName());
	}

}
