package com.pwc.training;

public class Car {
	
	private String model;
	private String make;
	private double kmsCovered;
	private String color;
	
	public Car(double value) {
		System.out.println("Car Constructor..");
	}
	
	public void setModel(String model) {
		this.model = model;
		
	}
	
	public String getmodel() {
		return this.model;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setKmsCovered(double kmsCovered) {
		this.kmsCovered = kmsCovered;
	}
	
	public double getKmsCovered() {
		return this.kmsCovered;
	}

}
