package com.pwc.training;

public class Person {
	
	private String name;
	private String address;
	private int age;
	
	private Car car;
	
	// Constructor overloading
	public Person() {
		
	}

	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getDetails() {
		return this.name +" who owns "
					      +this.getCar().getMake()+
					      " "+this.car.getMake()+
					      " has run his car for" +this.getCar().getKmsCovered()+ "kms";
	}
	
	// Access modifier
	// return type
	// method name
	// method parameter
	
	//Car car1;
	//Rohan who owns Honda City has run his car 43000 kms

}
