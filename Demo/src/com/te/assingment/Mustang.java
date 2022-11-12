package com.te.assingment;

public class Mustang extends Car {


	@Override
	public void start() {
		System.out.println("Mustang is Starting.....");
	}

	@Override
	public void run() {
		System.out.println("Let's go on Drive.......");
	}

	@Override
	public void ready() {
		System.out.println("Your Mustang is ready to Drive..... ");
	}

}
