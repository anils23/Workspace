package com.te.relationship;

import java.util.Scanner;

public class Office {

	public static void main(String[] args) {

		System.out.println(" \"Please Select the address\"");
		System.out.println(" 1} Home \n 2} Office \n 3} Village");

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

		Employee employee = new Employee();
		employee.name = "Anil Thapa";
		employee.id = 2023;
		// System.out.println(employee.address);
		// System.out.println(employee.address.hashCode());
		// employee.address = new Address(); Lazy initialization
		// employee.address.buldingNo = "G12 Building pune";
		// employee.address.pincode = 411026;
		System.out.println("Name -" + " " + employee.name);
		System.out.println("EmployeeId -" + " " + employee.id);
		System.out.println("====================================");
		// System.out.println("Address -" + " " + employee.address.buldingNo + " " +
		// employee.address.pincode);
		// System.out.println(employee.address);

		Address obj1 = new Address();
		obj1.buldingNo = "H01 Mumbai";
		obj1.pincode = 415203;

		Address obj2 = new Address();
		obj2.buldingNo = "C02 Chennai";
		obj2.pincode = 415694;

		Address obj3 = new Address();
		obj3.buldingNo = "D01 Delhi";
		obj3.pincode = 415803;

		switch (i) {
		case 1: {
			System.out.println("Its your Home address");
			employee.address = obj1;
			break;
		}
		case 2: {
			System.out.println("Its your Office address");
			employee.address = obj2;
			break;
		}
		case 3: {
			System.out.println("Its your Village address");
			employee.address = obj3;
			break;
		}

		default:
			System.out.println("Please select the approriate address");
		}

		System.out.println(employee.address);

	}

}
