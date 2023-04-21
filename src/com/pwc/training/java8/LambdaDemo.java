package com.pwc.training.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class LambdaDemo {

	public static void main(String... args) {
		
		//int total = add(12,14);
		
		MyFuncInterface obj = (a, b) -> a+b;
		
		System.out.println(obj.sum(30, 20));
		
		BiPredicate<Integer, Integer> p = (n,m) -> n > m;
		
		System.out.println(p.test(12,14));
		
		BiFunction<Integer, Integer, Double> avg = (x, y) -> (double)(x+y)/2;
		
		System.out.println(avg.apply(2,3));
		
		add(2,3);
		add(4,5,6);
		add();
	}
	
	public static int add(int... param) {  //varargs
		
		System.out.println(param.length);
		return 100;
	}
	
	

}

// Predicate: will take input(s) and returns a boolean
// Consumer: will take input(s), wont return anything
// Supplier: will return without taking input
// Function: will take input(s) return a type

// Lambda Exp
// Functional interface
// Stream api
// default and static methods in interface
// var-args
// method reference
