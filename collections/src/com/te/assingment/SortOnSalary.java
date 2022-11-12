package com.te.assingment;

import java.util.Comparator;

public class SortOnSalary implements Comparator<Employee> {


	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
