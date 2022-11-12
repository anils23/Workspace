package com.te.polymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		int add = calculator.add(10, 20, 30); // example of method overloading or compile time polymorphism
		System.out.println(add);
		
		  Calculator ch =new ScientificCalculator();
		  int add2 = ch.add(10, 10);  // example of method overriding or run time polymorphism
		  System.out.println(add2);
		  
		  int minus=ch.minus(100, 50); // example of method hiding or method shadowing
		  System.out.println(minus);
	
		
	}

}
