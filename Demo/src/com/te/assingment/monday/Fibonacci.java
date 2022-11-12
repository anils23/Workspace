package com.te.assingment.monday;

import java.util.Scanner;

public class Fibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int n1 = 0, n2 = 1, n3, i;
		System.out.print("Enter number for getting Fibonacci series : ");
		int count = scanner.nextInt();

		System.out.print(n1 + " " + n2);
		for (i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}
	}
}
