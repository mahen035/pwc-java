package com.pwc.training.abstraction;

public class SmallCar extends Car{

	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Buildind a small Car");
		
	}

}
