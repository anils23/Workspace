package com.te.assingment;

public class Audi extends Car {

	
	@Override
	public void start() {
		System.out.println("Audi is Starting.....");

	}

	@Override
	public void run() {
		System.out.println("Let's go on Drive.......");
	}

	@Override
	public void ready() {
		System.out.println("Your Audi is ready to Drive......");
	}

}
