package com.v2;

public class Car {

	 String color;
	String model;

	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("car is created");
	}

	public Car(String color, String model) {
		this.color = color;
		this.model = model;
	}
	
	public void disply() {
		System.out.println("the car color"+ this.color);
		System.out.println("the car model"+ this.model);
		
	}

}
