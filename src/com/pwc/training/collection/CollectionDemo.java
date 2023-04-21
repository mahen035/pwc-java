package com.pwc.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		 
		Set<String> names = new TreeSet<>();   //Generics: Type safety
		
		//Set<Employee> empList = new TreeSet<>(new NameComparator());
		
		List<Employee> empList = new ArrayList<>();
		
		Map<Integer, String> namesMap = new HashMap<>();
		
		namesMap.put(11, "Raj");  // es- spanish, en-English, fr-French...
		namesMap.put(12, "Mahi");
		namesMap.put(13, "Rahul");
		
		System.out.println(namesMap.get(11));
		
		for(Map.Entry<Integer, String> entry: namesMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		empList.add(new Employee("Mark", 107, 20000));
		empList.add(new Employee("David", 103, 40000));
		empList.add(new Employee("Sara", 102, 50000));
		empList.add(new Employee("Peter", 101, 20000));
		
		empList.add(2, new Employee("Kevin", 109, 25000));
		
		
		Collections.sort(empList, new IdComparator());
		
		System.out.println("***********Employees***********");
		for(Employee emp:empList) {
			System.out.println(emp.getEmpId()+":"+emp.getEmpName());
		}
		
		//int i = 2;
		// conversion of primitive to object is called boxing
		// conversion of object to primitive is called unboxing
		// Autoboxing
		//Integer a = new Integer(2); // Wrapper class
		names.add(new String("Zak"));
		names.add(new String("Ramesh"));
		names.add(new String("Mark"));
		names.add(new String("David"));
		
		Iterator<String> it = names.iterator();
		
		System.out.println("**********Names********");
		  while(it.hasNext()) {
			  String str = it.next();
			  System.out.println(str);
		}
		 

	}

}
