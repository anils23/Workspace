package com.te.exception;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
			throw new Exception(); // Its an Checked Exception, handling it is mandatory
		} catch (Exception e) {
			System.out.println("Checked exception handled");
		}
		try {
			throw new RuntimeException(); // Its an Unchecked Exception, Its not mandatory to handled
		} catch (Exception e) {
			System.out.println("Unchecked exception handled");
		}
		System.out.println("Program Ends");
	}

}
