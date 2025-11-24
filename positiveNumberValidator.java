package com.codegnan.oop.interfaces;

public class positiveNumberValidator implements Validator{

	@Override
	public boolean isValid(int n) {
		
		return n>0;
	}

	

}
