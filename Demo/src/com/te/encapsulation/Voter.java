package com.te.encapsulation;

public class Voter {

	private String name;
	private int age;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 18) {
			this.age = age;
			System.out.println("You are eligible " + this.name);
		} else {
			System.out.println("You are not eligible " + this.name);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
