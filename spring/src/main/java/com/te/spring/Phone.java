package com.te.spring;

public class Phone {

	private String model;
	private double price;
	
	public Phone(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", price=" + price + "]";
	}

}
