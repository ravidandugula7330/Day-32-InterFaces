package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class vechile_main {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter car moment");
	//for dummy input
	scanner.nextLine();
	
	//accessing from child class
	Vechile v=new car_vechile();
	System.out.println(v.move());
	scanner.close();
			
	}

}
