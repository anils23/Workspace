package com.te.assingment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlipkartFunction {

	private List<Flipkart> arrayList = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	public void home() {
		System.out.println();
		System.out.println("Welcome to Flipkart...!!!");
		System.out.println("1} Press 1 to display all the Products \n2} Press 2 to search Products"
				+ "\n3} Press 0 to exit the application");
		String next = scanner.next();
		if (next.equalsIgnoreCase("1")) {
			displayAll();
			System.out.println();
			forHome();
		} else if (next.equalsIgnoreCase("2")) {
			search();
		} else if (next.equalsIgnoreCase("0")) {
			System.out.println("application closed...!!!");
			scanner.close();
			System.exit(0);

		} else {
			System.out.println("Please enter the valid input");
			home();
		}
	}

	private void search() {
		System.out.println("Hey can i know what u r searching for...!!!");
		System.out.print("Product Name :");
		String next = scanner.next();
		if (arrayList.stream().anyMatch(f -> f.getProductName().equalsIgnoreCase(next))) {
			List<Flipkart> collect = arrayList.stream().filter(f -> f.getProductName().equalsIgnoreCase(next))
					.collect(Collectors.toList());
			Flipkart flipkart = collect.get(0);
			afterSearch(flipkart);
		} else {
			System.out.println("Sorry Buddy, this product is not available...!!!");
			search();
		}

	}

	private void afterSearch(Flipkart flipkart) {
		System.out.println(flipkart);
		System.out.println();
		System.out.println("1} Press 1 to buy " + flipkart.getProductName() + "\n2} Press 2 to search again"
				+ "\n3} Press 0 for HomePage");
		String next = scanner.next();
		switch (next) {
		case "1":
			buy(flipkart);
		case "2":
			search();
		case "0":
			home();
		default:
			System.out.println("Press enter a valid input...!!!");
			afterSearch(flipkart);
		}

	}

	private void buy(Flipkart flipkart) {
		System.out.print("Quantity :");
		int nextInt = scanner.nextInt();
		if (nextInt<=flipkart.getNoOfProducts()) {			
			System.out.println("Make a payment to buy the product");
			System.out.println("=================================");
			System.out.println("Please enter your card Details");
			cardNumber();
			cvv();
			System.out.println("Payment Successfull...!!!");
			System.out.println("Your Product will be delivered in 3 days...!!!");
			flipkart.setNoOfProducts(flipkart.getNoOfProducts() - nextInt);
			forHome();
		}else {
			System.out.println("Sorry buddy only "+flipkart.getNoOfProducts()+" "+flipkart.getProductName()+" are available ...!!! ");
            buy(flipkart);		
		}
	}

	private void forHome() {
		System.out.print("Enter 0 for HomePage :");
		String next2 = scanner.next();
		if (next2.equalsIgnoreCase("0")) {
			home();
		} else {
			System.out.println("Please enter a valid input...!!!");
			forHome();
		}

	}

	private void cardNumber() {
		System.out.print("Enter your 16 digit Card No :");
		String next = scanner.next();
		if (next.length() == 16) {
			return;
		} else {
			System.out.println("Invalid Card Number...!!!");
			System.out.println("Please TRY AGAIN...!!!");
			cardNumber();
		}

	}

	private void cvv() {
		System.out.print("Enter your 3 digit CVV No :");
		String next = scanner.next();
		if (next.length() == 3) {
			return;
		} else {
			System.out.println("Invalid CVV...!!!");
			System.out.println("Please TRY AGAIN...!!!");
			cvv();
		}
	}

	private void displayAll() {

		for (Flipkart flipkart : arrayList) {
			System.out.println(flipkart);
		}
	}

	{
		arrayList.add(new Flipkart(1001, "Laptop", 35000, "Grey", "brand=ASUS, ram=12GB, 1000TB SSD", 10));
		arrayList.add(new Flipkart(1002, "Mobile", 29990, "Dusky blue", "brand=Vivo, ram=12GB, 128GB storage", 10));
		arrayList.add(new Flipkart(1003, "Watch", 1200, "Black", "Time and date facility", 10));
	}

}
