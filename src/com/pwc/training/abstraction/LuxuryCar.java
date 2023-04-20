package com.pwc.training.abstraction;

public class LuxuryCar extends Car{

	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Building Luxury Car");
		
	}

}
