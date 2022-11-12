package com.te.threads.syn;

public class Customer extends Thread {
	


	Tonique tonique;
	String name;
	String brand;

	public Customer(Tonique tonique, String name, String brand) {
		super();
		this.tonique = tonique;
		this.name = name;
		this.brand = brand;
	}

	@Override
	public void run() {
		tonique.buy(brand, 2);
	}

}
