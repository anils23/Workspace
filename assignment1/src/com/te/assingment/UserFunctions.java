package com.te.assingment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserFunctions {

	private List<Contacts> arrayList = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	public void home() {
		System.out.println("===============================================");
		System.out.println("Welcome buddy...!!!");
		System.out.println("1} Press 1 to display all your contacts " + "\n2} Press 2 to search any contacts "
				+ "\n3} Press 3 to perform operation in contacts " + "\n4} Press 0 to exit");
		String next = scanner.next();
		if (next.equalsIgnoreCase("1")) {
			displayAll();
		} else if (next.equalsIgnoreCase("2")) {
			search();
		} else if (next.equalsIgnoreCase("3")) {
			operate();
		} else if (next.equalsIgnoreCase("4")) {
			System.out.println("application closed...!!!");
			scanner.close();
			System.exit(0);
		}

		else {
			System.out.println("Please select valid function");
			home();
		}

	}

	private void forHome() {
		System.out.println();
		System.out.print("Enter 0 for HomePage :");
		String next2 = scanner.next();
		if (next2.equalsIgnoreCase("0")) {
			home();
		} else {
			System.out.println("Please enter a valid input...!!!");
			forHome();
		}

	}

	private void operate() {
		System.out.println("===========================================");
		System.out.println(
				"1} Enter 1 to add member \n2} Enter 2 to delete member \n3} Enter 3 to edit member \n4} Enter 0 for home page");
		String next = scanner.next();
		switch (next) {
		case "1": {
			add();
			operate();
		}
		case "2": {
			delete();
			operate();
		}
		case "3": {
			edit();
			operate();
		}
		case "0": {
			home();
		}
		default:
			System.out.println("Please enter a valid input...!!!");
			operate();
		}

	}

	private void add() {
		System.out.print("Please enter the name to add :");
		String name = scanner.next();
		System.out.print("Please enter his Phone number :");
		long number = scanner.nextLong();
		System.out.print("group :");
		String group = scanner.next();
		arrayList.add(new Contacts(name, number, group));
		System.out.println("Contact added...!!!");
	}

	@SuppressWarnings("unlikely-arg-type")
	private void delete() {
		System.out.print("Please enter the name to delete :");
		String next = scanner.next();
		List<Contacts> collect = arrayList.stream().filter(u -> u.getName().equalsIgnoreCase(next))
				.collect(Collectors.toList());
		arrayList.remove(collect);
		System.out.println("Contact deleted...!!!");
	}

	private void edit() {
		System.out.print("Please enter the name to edit :");
		String next = scanner.next();
		List<Contacts> collect = arrayList.stream().filter(u -> u.getName().equalsIgnoreCase(next))
				.collect(Collectors.toList());
		Contacts contacts = collect.get(0);
		System.out.println("Select the field which you want to edit?");
		System.out.println(
				"1} Press 1 for name \n2} Press 2 for phone Number \n3} Press 3 for group \n4} Pres 0 for home page");
		String next3 = scanner.next();
		switch (next3) {
		case "1": {
			System.out.print("Enter the new name :");
			String next2 = scanner.next();
			contacts.setName(next2);
			System.out.println("Name updated...!!!");
			operate();
		}
		case "2": {
			System.out.print("Enter the new phone number :");
			long next2 = scanner.nextLong();
			contacts.setPhoneNo(next2);
			System.out.println("phone Number updated...!!!");
			operate();
		}
		case "3": {
			System.out.print("Enter the group :");
			String next2 = scanner.next();
			contacts.setGroup(next2);
			System.out.println("group updated...!!!");
			operate();
		}
		case "0": {
			home();
		}
		default:
			System.out.println("Please enter valid input...!!!");
			edit();
		}
	}

	private void displayAll() {
		System.out.println("All the contacts present in your phone is :");
		for (Contacts contacts : arrayList) {
			System.out.println(contacts);
		}
		forHome();
	}

	{
		arrayList.add(new Contacts("anil", 7507424458l, "admin"));
		arrayList.add(new Contacts("sanjay", 9762415134l, "brother"));
		arrayList.add(new Contacts("bharat", 7504256359l, "brother"));

	}

	private void search() {
		System.out.print("Please enter the name :");
		String next = scanner.next();
		if (arrayList.stream().anyMatch(u -> u.getName().equalsIgnoreCase(next))) {
			List<Contacts> collect = arrayList.stream().filter(u -> u.getName().equalsIgnoreCase(next))
					.collect(Collectors.toList());
			Contacts contacts = collect.get(0);
			afterSearch(contacts);
		} else {
			System.out.println("Sorry No contacts with this name");
			search();
		}
	}

	private void afterSearch(Contacts contacts) {
		System.out.println();
		System.out.println("1} Press 1 to call " + contacts.getName() + "\n2} Press 2 to message " + contacts.getName()
				+ "\n3} Press 3 to return to Home");
		String next = scanner.next();
		if (next.equalsIgnoreCase("1")) {
			System.out.println("Calling ...." + contacts.getName());
			System.out.println("Press 0 to end call");
			String next2 = scanner.next();
			if (next2.equalsIgnoreCase("0")) {
				System.out.println("call ended...!!!");
				afterSearch(contacts);
			} else {
				System.out.println("Please enter 0 to end the call");
				scanner.next();
				System.out.println("call ended...!!!");
				afterSearch(contacts);
			}

		} else if (next.equalsIgnoreCase("2")) {
			System.out.println("Message sent to " + contacts.getName() + "...!!!");
			afterSearch(contacts);
		} else if (next.equalsIgnoreCase("3")) {
			home();
		} else {
			System.out.println("Please enter valid input");
			afterSearch(contacts);
		}

	}

}
