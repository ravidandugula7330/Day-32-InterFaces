package com.codegnan.oop.interfaces;
//implementations

public class SimplePasswordChecker implements PasswordChecker {

	@Override
	public String checkLength(String password) {
		
		return ("Length :"+password.length());
	}

	@Override
	public String checkComplexity(String password) {
		if(password.length()<8) {
			return "week";
		}else if(password.length()==8) {
			return "medium";
		}else {
			return"strong";
		}
		
	}

	
}
