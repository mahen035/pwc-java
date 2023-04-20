package com.pwc.training.exception;

import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		Student stud1 = new Hosteller();
		//stud1.getRoomNo();
		
		
		
		try {
			FileReader reader = new FileReader("demo.txt");
			stud1.getRoomNo();
			int y = 2;
		
			int x = 6/y;
			
			if( x > 2) {
				throw new MyException("Value of x is not permissible");
			}
		}
		catch(Exception e) {
			if(e instanceof ArithmeticException)
				System.out.println("Arithmetic exception occurred");
			else if(e instanceof NumberFormatException)
				System.out.println("NumberFormatException occurred");
			else if(e instanceof MyException)
				System.out.println(e.getMessage());
			else
				System.out.println("Unknown Exception");	
		}
		finally {
			// do all the clean up work
			System.out.println("Finally block");
		}
				
		System.out.println("Program Continues..");

	}

}

//Exception: Any piece of code which can disrupts the normal flow of execution

// try, catch, finally, throws, throw

// 1. Checked Exception : Compile time exception, FileNotFoundException, SQLException
// 2. Unchecked Exception: ArithmeticExeption, NumberFormatException, ArrayIndexOutOfBoundException
//                        All custom Exceptions