package com.te.defaultmethods;

public interface Demo {
	
	public default void m2() {
		System.out.println("This is default method of java 1.8");
	}
}
