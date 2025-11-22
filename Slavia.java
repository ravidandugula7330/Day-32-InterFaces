package com.codegnan.oop.interfaces;

public class Slavia implements Car {

	@Override
	public void accelerate(int points) {
		if(points<=100&&points>=10) {
			System.out.println("Salvia speed is :"+points);
		}
	}

	@Override
	public void turnDirection(String dir) {
		if(dir.equalsIgnoreCase("left")) {
			System.out.println("Slvia is turning left");
		}if(dir.equalsIgnoreCase("right")) {
			System.out.println("Salvia is turning right");
		}
		
	}

	@Override
	public void stop() {
		System.out.println("Salvia has stopped");
		
	}
	//Additional method
	public void sunRoof() {
		System.out.println("Sun Roof is opened");
	}
}
