package com.pwc.training.abstraction;

public class SedanCar extends Car implements Vehicle{

	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Building Sedan Car");
		
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		
	}

}
