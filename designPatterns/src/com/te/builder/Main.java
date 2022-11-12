package com.te.builder;

public class Main {
	
	public static void main(String[] args) {
		Employee build = Employee.builder().id(101).build();
		System.out.println(build);
	}

}
