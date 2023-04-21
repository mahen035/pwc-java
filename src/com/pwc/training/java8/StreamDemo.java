package com.pwc.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2, 3, 9, 1, 7, 5, 8);
		
	//List<Integer> squaredOddNumbers 
		int sum = numbers
		.stream()
		.filter(n->n%2!=0)
		.map(x->x*x)
		.sorted()
		//.forEach(System.out::println);
		//.collect(Collectors.toList());
		.reduce(0,(a,b)->a+b);
		
		System.out.println(sum);

	}

}
/*
  sorted((User u1, User u2) -> {
  if(u1.getAge() > u2.getAge()
  		return 1;
  else if(u1.getAge() < u2.getAge()
  		return -1;
  else
  		return 0;
  })
 
 */


// take a collection of strings representing names
// filter only those names that start with "S"
// then convert them to uppercase and display them in sorted way

//1. create stream from the collection
//2. apply intermediate operation on the stream : transform your collection
//3. apply terminal operation to close the stream

// Create an User class with userName and age 
// Create list of users and sort them based on age using stream api
