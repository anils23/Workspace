package com.te.assignment;

import java.util.List;

public class Employee {
	
	private String name;
	private int id;
	private double salary;
	private String gender;
	private String department;
	
	private Address address;
	
	private List<Employee> list;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	public Employee() {
	}

	public Employee(String name, int id, double salary, String gender, String department, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.gender = gender;
		this.department = department;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Employee [NAME=" + name + ", ID=" + id + ", SALARY=" + salary + ", GENDER=" + gender + ", DEPARTMENT="
				+ department + ", ADDRESS=" + address + "]";
	}
	
	
	
	

}
