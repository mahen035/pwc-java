package com.pwc.training.abstraction;

public class CarFactory {
	
	public static Car buildCar(CarType model) {
		Car car = null;
		switch(model) {
		case SMALL:
			car = new SmallCar();
			break;
		case SEDAN:
			car = new SedanCar();
			break;
		case LUXURY:
			car = new LuxuryCar();
			break;
		default:
			System.out.println("Invalid Car Type..");
		}
		return car;
	}

}
