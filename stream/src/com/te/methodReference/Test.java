package com.te.methodReference;

@FunctionalInterface
public interface Test {
	
	public void  m1();
	
	public static void m2() {
		System.out.println("static");
	}

}
