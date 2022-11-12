package com.jspiders.DesignPattern.Builder;

public class LaptopBuilder {
	
	String brand;
	String model;
	String processor;
	int ram;
	int rom;
	int display;
	
	public LaptopBuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	
	public LaptopBuilder model(String model) {
		this.model=model;
		return this;
	}
	
	public LaptopBuilder processor(String processor) {
		this.processor=processor;
		return this;
	}
	
	public LaptopBuilder ram(int ram) {
		this.brand=brand;
		return this;
	}

	public LaptopBuilder rom(int rom) {
		this.rom=rom;
		return this;
	}
	
	public LaptopBuilder display(int display) {
		this.display=display;
		return this;
	}
	
	public Laptop build() {
		Laptop obj=new Laptop(this.brand, this.model, this.processor, this.ram,this.rom,this.display);
		return obj;
	}
}
