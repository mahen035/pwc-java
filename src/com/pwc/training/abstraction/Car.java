package com.pwc.training.abstraction;

public abstract class Car {
	
	private CarType model;
	
	public Car(CarType model) {
		
		this.model = model;
		
	}
	
	public abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

}
