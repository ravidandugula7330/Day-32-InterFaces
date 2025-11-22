package com.codegnan.oop.interfaces;

public class Fortuner implements Car {

	@Override
	public void accelerate(int points) {
		if(points<=100&&points>=10) {
			System.out.println("Fortuner speed is :"+points);
		}
	}

	@Override
	public void turnDirection(String dir) {
		if(dir.equalsIgnoreCase("left")) {
			System.out.println("Fortuner is turning left");
		}if(dir.equalsIgnoreCase("right")) {
			System.out.println("Fortuner is turning right");
		}
		
	}

	@Override
	public void stop() {
		System.out.println("Fortuner is stopped");
		
	}	
	public void fourWheel() {
		System.out.println("Fortuner engagged with four Wheel");
	}
}
