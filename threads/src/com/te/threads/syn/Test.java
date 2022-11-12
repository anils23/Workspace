package com.te.threads.syn;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		Tonique tonique = new Tonique();
		Customer customer = new Customer(tonique,"anil", "Old Monk");
		Customer customer2 = new Customer(tonique,"sanjay", "Oak Smith Gold");
		Customer customer3 = new Customer(tonique, "bharat", "100 Pipers");
		
		customer.start();
		customer2.start();
		customer3.start();
		
		Supplier supplier = new Supplier(tonique, "dheeraj", "100 Pipers");
		Thread.sleep(1000);
		supplier.start();
		
		
		
		
	}

}
