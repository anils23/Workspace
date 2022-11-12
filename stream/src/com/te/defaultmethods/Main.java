package com.te.defaultmethods;

public class Main implements Test, Demo {

	public static void main(String[] args) {
		Test.m1(); // static methods can be directly accessed without creating an object

		Main main = new Main();
		main.m2(); // for default method its mandatory to create an object
	}

	@Override
	public void m2() {
		// Demo.super.m2();   if i want to access demo interface m2()
//        Test.super.m2();    if i want to access test interface m2()
		System.out.println("Overriden method");
	}

}
