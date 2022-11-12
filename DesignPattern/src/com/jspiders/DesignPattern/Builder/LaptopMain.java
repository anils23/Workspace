package com.jspiders.DesignPattern.Builder;

public class LaptopMain {
	
	public static void main(String[] args) {
		
		Laptop obj=new LaptopBuilder().brand("ASUS").processor("I3").build();
		System.out.println(obj);
	}

}
