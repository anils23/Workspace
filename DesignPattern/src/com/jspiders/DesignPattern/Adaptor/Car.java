package com.jspiders.DesignPattern.Adaptor;

public interface Car {
	
	void speed();
	void milage();
	void color();
	void airbags();
	
	static void test() {
		System.out.println("FORTUNER");
	}

}
