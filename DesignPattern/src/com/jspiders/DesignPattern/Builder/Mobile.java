package com.jspiders.DesignPattern.Builder;

public class Mobile {
	
	String model;
	String brand;
	int ram;
	int rom;
	String processor;
	int battery;
	int frontCamera;
	int rearCamera;
	double price;
	String color;
	boolean fingerprint;
	
	public Mobile(String model, String brand, int ram, int rom, String processor, int battery, int frontCamera,
			int rearCamera, double price, String color, boolean fingerprint) {
		super();
		this.model = model;
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.battery = battery;
		this.frontCamera = frontCamera;
		this.rearCamera = rearCamera;
		this.price = price;
		this.color = color;
		this.fingerprint = fingerprint;
	}
	
	public String toString() {
		return "Mobile \nmodel=" + model + ", \nbrand=" + brand + ", \nram=" + ram + ", \nrom=" + rom + ", \nprocessor="
				+ processor + ",\nbattery=" + battery + ", \nfrontCamera=" + frontCamera + ", \nrearCamera=" + rearCamera
				+ ", \nprice=" + price + ", \ncolor=" + color + ", \nfingerprint=" + fingerprint + "";
	}

	
	
	
	
	

}
