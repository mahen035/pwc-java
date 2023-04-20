package com.pwc.training.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
	try {
		MyClass obj1 = new MyClass("Hello", 35, 3.14, 23);
		System.out.println("Obj1:"+obj1);
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("serial");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj1);
	    
		//Desirialization
		MyClass obj2;
		
		FileInputStream fis = new FileInputStream("serial");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		obj2 = (MyClass)ois.readObject();
		
		System.out.println("Obj2: "+obj2);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
		

	}

}
