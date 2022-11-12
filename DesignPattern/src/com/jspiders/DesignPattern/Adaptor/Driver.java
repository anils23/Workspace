package com.jspiders.DesignPattern.Adaptor;

public class Driver {
	
	public static void main(String[] args) {
		
		CarAdaptor obj=new CarAdaptor();
	    Car.test();
		obj.speed();
		obj.milage();
		obj.color();
		obj.airbags();
	}

}
