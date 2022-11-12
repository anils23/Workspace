package com.te.springJavaBased;

public class Laptop {

	private String brand;
	private double price;
	private String processor;

	
	private Battery battery;

	public Laptop() {
	}

	public Laptop(String brand, double price, String processor) {
		super();
		this.brand = brand;
		this.price = price;
		this.processor = processor;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

//	@Override
//	public String toString() {
//		return "Laptop [brand=" + brand + ", price=" + price + ", processor=" + processor + ", battery=" + battery
//				+ "]";
//	}


}
