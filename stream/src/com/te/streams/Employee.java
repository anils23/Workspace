package com.te.streams;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private int id;
	private Double salary;

	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee)obj;
		return this.id == employee.id;
	}
	
	

}
