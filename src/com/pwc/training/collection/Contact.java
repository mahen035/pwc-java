package com.pwc.training.collection;

public class Contact {
	
	private long phoneNumber;
	private String name;
	private String address;
	
	public Contact() {
		
	}

	public Contact(long phoneNumber, String name, String address) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	
	
}
