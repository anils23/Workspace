package com.jspiders.DesignPattern.Builder;

public class Laptop {

	String brand;
	String model;
	String processor;
	int ram;
	int rom;
	int display;
	
	
	public Laptop(String brand, String model, String processor, int ram, int rom, int display) {
		super();
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.rom = rom;
		this.display = display;
	}


	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", processor=" + processor + ", ram=" + ram + ", rom="
				+ rom + ", display=" + display + "]";
	}
	
	
	
}
