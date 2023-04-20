package com.pwc.training.io;

import java.io.Serializable; //Marker interface

public class MyClass implements Serializable{

	private static final long serialVersionUID = -2063664454419251524L;
	private String str;
	private int i;
	private double d;
	private transient int age;
	
	public MyClass(String str, int i, double d, int age) {
		this.str = str;
		this.i = i;
		this.d = d;
		this.age = age;
	}

	@Override
	public String toString() {
		return "str=" + str + ", i=" + i + ", d=" + d+", age="+age;
	}

	
}
