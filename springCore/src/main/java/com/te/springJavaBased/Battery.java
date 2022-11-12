package com.te.springJavaBased;

public class Battery {

	private String brand;
	private int duration;
	private String color;


	public Battery(String brand, int duration, String color) {
		super();
		this.brand = brand;
		this.duration = duration;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Battery [brand=" + brand + ", duration=" + duration + ", color=" + color + "]";
	}

}
