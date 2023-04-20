package com.pwc.training;

public class SedanCar extends Car {
	
	private double cargoSize;
	
	public SedanCar(double cargoSize) {
		super(cargoSize);
		System.out.println("Sedan Car Constructor..");
	}

	public double getCargoSize() {
		return cargoSize;
	}

	public void setCargoSize(double cargoSize) {
		this.cargoSize = cargoSize;
	}
	
	/*
	 * @Override public void setMake(String make) {
	 * System.out.println("Overridden by child class"); }
	 */

	@Override
	public String toString() {
		return "SedanCar [cargoSize=" + cargoSize + ", Model=" + getmodel() + ", Make=" + getMake() + "]";
	}

	
	
	

}
