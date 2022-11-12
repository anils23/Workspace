package com.te.exception.customexception2;

import java.util.Scanner;

public class UnionBank {

	static Scanner scanner;
	static Customer customer;
	static Customer customer2;


	public static void withdrawAmount() {

		System.out.println("Please enter your Account no :");
		int accNo = scanner.nextInt();
		System.out.println("Please enter you want to withdraw :");
		int amounttowithdraw = scanner.nextInt();

		switch (accNo) {
		case 123456789: {
			if (customer.getBalance() < 1) {
				try {
					throw new LowBalanceException("You are not eligible to withdraw");
				} catch (LowBalanceException e) {
					System.out.println(e.getMessage());
					break;
				}
			} else {
				int amount1 = customer.getBalance() - amounttowithdraw;
				customer.setBalance(amount1);
				System.out.println("Your Balance is : "+customer.getBalance());
				break;
			}
		}
		case 987654321: {
			if (customer2.getBalance() < 1) {
				try {
					throw new LowBalanceException("You are not eligible to withdraw");
				} catch (LowBalanceException e) {
					System.out.println(e.getMessage());
					break;
				}
			} else {
				int amount2 = customer2.getBalance() - amounttowithdraw;
				customer2.setBalance(amount2);
				System.out.println("Your Balance is : " +customer2.getBalance());
				break;
			}
		}

		default:
			System.out.println("Please enter valid account no");
			withdrawAmount();
		}

	}

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		customer = new Customer("anil", 123456789, 0);
		customer2 = new Customer("sanjay", 987654321, 500);

		withdrawAmount();


	}

}
