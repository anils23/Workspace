package com.te.defaultmethods;

public interface Test {
	
	static final int a = 11;
	
	public static void m1() {
		System.out.println("This is static method of java 1.8");
	}

	public default void m2() {
		System.out.println("This is default method of java 1.8");
	}
}
