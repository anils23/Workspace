package com.te.assingment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Access {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee("anil", 01, 1000000.0));
		arrayList.add(new Employee("sanjay", 02, 150000.0));
		arrayList.add(new Employee("bharat", 03, 20000.0));
		arrayList.add(new Employee("renuka", 04, 164600.0));
		arrayList.add(new Employee("asmita", 05, 651000.0));
		

		System.out.println("Enter on which parameter you want to sort :");
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		
		if (next.equalsIgnoreCase("name")) {
			Collections.sort(arrayList, new SortOnName());
		} else if (next.equalsIgnoreCase("salary")) {
			Collections.sort(arrayList, new SortOnSalary());
		} else if (next.equalsIgnoreCase("id")) {
			Collections.sort(arrayList);
		}

		Iterator<Employee> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		if (scanner != null) {
			scanner.close();
		}
	

	}

}
