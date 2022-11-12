package com.te.assingment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeMain {
	
	public static void main(String[] args) {
		
		TreeSet<Employee> treeSet = new TreeSet<>();
		treeSet.add(new Employee("anil", 01, 120.100));
		treeSet.add(new Employee("sanjay", 07, 5210.100));
		treeSet.add(new Employee("rakesh", 05, 156532.100));
		
		Iterator<Employee> iterator = treeSet.iterator();
	
		while (iterator.hasNext()) {
			
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
		iterator.remove();

	}

}
