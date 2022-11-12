package com.te.polymorphism;

public class ScientificCalculator extends Calculator{
	
	@Override
	public int add(int a, int b) {
		return a+b+20;
	}

	static int minus(int a, int b) {
		return a-b+10;
	}
}
