package com.te.assingment;

import java.util.Scanner;

public class Customer {

	static Scanner scanner = new Scanner(System.in);
	static Car car;
	

	public static void selectEngine() {

		System.out.println("Please Select Engine?");
		System.out.println(" 1} FuelCapacity - 500 liters, HorsePower - high, Cyclinder - 02 \n 2} FuelCapacity - 1000 liters, HorsePower - Extreme, Cyclinder - 04");
		Engine basic = new Engine(500, "High", 02);
		Engine high = new Engine(1000, "Extreme", 04);
		int i = scanner.nextInt();

		switch (i) {
		case 1: {
			car.engine = basic;
			break;
		}
		case 2: {
			car.engine = high;
			break;
		}
		default:
			System.out.println("Please Select appropriate Engine !!");
			selectEngine();
		}

	}

	public static String selectAudiModel() {

		System.out.println("Please Select the Model?");
		System.out.println(" 1} Audi AS \n 2} Audi R1");

		AudiModels model1 = new AudiModels("Audi AS");
		AudiModels model2 = new AudiModels("Audi R1");

		int int1 = scanner.nextInt();
		switch (int1) {
		case 1: {
			return model1.Model;
		}
		case 2: {
		     return model2.Model;
		}
		default:
			System.out.println("Please select the appropriate Model !!!");
			selectAudiModel();
		}
          return null;
	
	}
	
	public static String selectMustangModel() {

		System.out.println("Please Select the Model?");
		System.out.println(" 1} Mustang ST \n 2} Mustang G1");

		MustangModels mustangmodel1 = new MustangModels("Mustang ST");
		MustangModels mustangmodel2 = new MustangModels("Mustang G1");

		int int1 = scanner.nextInt();
		switch (int1) {
		case 1: {
			return mustangmodel1.Model;
		}
		case 2: {
		     return mustangmodel2.Model;
		}
		default:
			System.out.println("Please select the appropriate Model !!!");
			selectAudiModel();
		}
          return null;
	
	}

	public static void selectCar() {

		System.out.println("Please Select Car?");
		System.out.println(" 1} Audi \n 2} Mustang");

		int x = scanner.nextInt();
		switch (x) {
		case 1: {
			car = new Audi();
			String a1 = selectAudiModel();
			selectEngine();
			display(a1);
			break;
		}
		case 2: {
			car = new Mustang();
			String m1 = selectMustangModel();
			selectEngine();
			display(m1);
			break;
		}
		default: {
			System.out.println("Please Select appropriate car !!");
			selectCar();
		}
		}

	}

	public static void selectColor() {
		System.out.println("Please Enter the Color:");
		car.color = scanner.next();
	}

	public static void selectAirbags() {
		System.out.println("Do you want AirBag?");
		System.out.println(" Yes or No");
		car.airbags = scanner.next();

	}
	
	public static void display(String name) {
		selectColor();
		selectAirbags();
		System.out.println("========================================");
		car.ready();
		System.out.println("Car name with Model : "+name);
		System.out.println("Is airBag available : " + car.airbags);
		System.out.println("The Color of your Car is " + car.color);
		System.out.println(car.engine);
		car.start();
		car.run();
		
	}

	public static void main(String[] args) {
	
		selectCar();
		
		

	}
}
