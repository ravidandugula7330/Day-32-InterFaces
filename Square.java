package com.codegnan.oop.interfaces;

public class Square implements MathOperation {

	@Override
	public int operator(int x) {
		
		return x*x;
	}

}
