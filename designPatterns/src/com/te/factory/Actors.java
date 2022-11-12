package com.te.factory;

import java.util.Scanner;

public class Actors {

	static Avengers avengers;

	@SuppressWarnings("resource")
	public static Avengers factory() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Select the Avengers :");
		System.out.println(" 1} IronMan \n 2} Thor \n 3} Captain America \n 4} Hulk \n 5} Black Widow");
		int a = scanner.nextInt();

		switch (a) {
		case 1: {
			avengers = new IronMan();
			return avengers;
		}
		case 2: {
			avengers = new Thor();
			return avengers;
		}
		case 3: {
			avengers = new CaptainAmerica();
			return avengers;
		}
		case 4: {
			avengers = new Hulk();
			return avengers;
		}
		case 5: {
			avengers = new BlackWidow();
			return avengers;
		}
		default:
			System.out.println("Please select valid Avenger ???");
			factory();
		}
		return avengers;

	}
	

}
