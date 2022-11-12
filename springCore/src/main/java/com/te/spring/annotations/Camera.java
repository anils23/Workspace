package com.te.spring.annotations;

public class Camera {

	private int noOfCamera;

	private String brand;

	private int pixel;
 
	@Override
	public String toString() {
		return "Camera [noOfCamera=" + noOfCamera + ", brand=" + brand + ", pixel=" + pixel + "]";
	}

	public Camera(int noOfCamera, String brand, int pixel) {
		super();
		this.noOfCamera = noOfCamera;
		this.brand = brand;
		this.pixel = pixel;
	}

	public int getNoOfCamera() {
		return noOfCamera;
	}

	public void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

}
