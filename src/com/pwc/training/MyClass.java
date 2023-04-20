package com.pwc.training;

import java.util.Scanner;
public class MyClass {
	
	public static void main(String args[]) {
		//System.out.println("Welcome to My Class");
		//System.out.println(args[2]);
		
		String str = "Hello";
		
		str.concat(" World");
		
		System.out.println(str);
		
		Person p1 = new Person("John","Mumbai", 34);
		
		Person p2 = new Person();
		
		/*
		 * 2 7 9
		 * 4 5 
		 * 6 9 
		 */
		
		int[][] numbers = new int[3][];
		numbers[0] = new int [3];
		numbers[1] = new int [2];
		numbers[2] = new int [2];
		
		for(int i = 0 ; i<numbers.length; i++ ) {
			for(int j=0; j<numbers[i].length; j++) {
				numbers[i][j] = i*2 + j;
			}
		}
		
		for(int i = 0 ; i<numbers.length; i++ ) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[4];
		
		int[] newNumbers = {3, 5, 7};
		
		System.out.println("Enter a sentence"); 
		//Java language seems to be fun, more fun than other language
		String[] str = sc.nextLine().split(" ");
		int flag =0;
		for(int i = 0; i<str.length; i++) {
			int count = 1;
			String match = "";
			for(int j = i+1; j<str.length;j++) {
				if(str[i].equals(str[j])) {
					match = str[j];
					flag++;
					count++;
					
				}
			}
			if(count>1)
			System.out.println(match+" " +count+":times");
		}
		if(flag == 0)
			System.out.println("No Repeating words");
		
		
		String str1 = "Welcome";  // String Literal
		
		//String str2 = "Welcome";
		
		str1 = str1.concat(" to JAVA");
		
		//System.out.println(str1);
		
		/*
		String s1 = new String("hello");
		
		String s2 = new String("hello");
		
		System.out.println(str1 == str2);
		
		System.out.println(s1 == s2);
		
		Person p1 = new Person();
		
		System.out.println(p1);
		
		/*
		byte b = (byte) 128;
		
		System.out.println(b);
		
		int i = b;
		
		float f = 2.12f;
		
		char ch = 'A';
		
		char ch1 = 66;
		
		short alpha = (short) ch;
		
		System.out.println(alpha);
		
		System.out.println(ch1);
		
		short s = (short)i; //explicit casting
		
		double avg = (double)(12+13)/2; //12.5
		
		System.out.println(avg);
		/*
		 * Person p1 = new Person(); p1.setName("Peter"); p1.setAge(23);
		 * 
		 * Car c1 = new Car(); c1.setMake("Honda"); c1.setModel("City");
		 * c1.setKmsCovered(23456);
		 * 
		 * p1.setCar(c1); System.out.println(p1.getDetails());
		 */
		
		//String name = "Rohan";
	}
	
}

// split method

// take a sentence from the user as input and identify which words are 
// repeated in the sentence
// EX: "Java language seems to be fun, more fun than other language"

// create a method which takes 2 integer input parameters and returns their 
// average value

// Output: Rohan who owns Honda City has run his car 43000 kms

// System in a class in java.lang package
// out is a member of System class with PrintStream type
// println is a method in PrintStream class

// Display the number of arguments you are sending 
// in command line argument.

// Arrays: store multiple values of same datatype

// int[] numbers = new int[6]

// Create a Student class with id, name, rollno, marks[], average, grade
// methods like calculateAverage and findGrade
// if average > 80 then grade will be A
// if average is between 60 and 80 grade will be B
// if average is below 60 then grade is C
// display average and grade