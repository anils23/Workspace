package com.te.assingment.monday;

import java.util.ArrayList;
import java.util.Scanner;

public class Addition {

	static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		add();
	}

	public static void add() {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		System.out.println("Please enter the number to add:");

		int total = 0;
		int i=0;
		while (i>=0) {	
			arrayList.add(scanner.nextInt());
			total = total + arrayList.get(i);
			if (i >= 1) {
				System.out.println("The sum of all your number is : " + total);
			}
			i++;
		}
	
	}

}
