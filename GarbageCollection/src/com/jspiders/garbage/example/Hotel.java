package com.jspiders.garbage.example;

public class Hotel {

	private String name;
	private String address;
	private int pincode;

	public void items() {
		System.out.println("There are total 9 items");
	}

	public void display() {
		System.out.println(name + " " + address + " " + pincode);

	}

	public Hotel(String name, String address, int pincode) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public int getPincode() {
		return pincode;
	}

	@Override
	protected void finalize() {
		System.out.println("fianlize method called");
	}

}
