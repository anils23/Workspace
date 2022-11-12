package com.te.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Value("Iphone 14")
	private String name;
 
	@Value("Apple")
	private String brand;

	@Value("Grey")
	private String color;

	@Value("178000")
	private double price;

	@Autowired
	private Screen screen;

	@Autowired
	private Camera camera;

	@Autowired
	private SimCard sim;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public SimCard getSim() {
		return sim;
	}

	public void setSim(SimCard sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", color=" + color + ", price=" + price + ", screen="
				+ screen + ", camera=" + camera + "]";
	}

}
