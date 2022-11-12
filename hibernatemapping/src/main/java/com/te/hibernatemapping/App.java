package com.te.hibernatemapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	static EntityManagerFactory factory;
	static EntityManager manager;
	static EntityTransaction transaction;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	public static void closeConnection() {
		System.out.println("program end");
		factory.close();
		manager.close();
	}

	public static void main(String[] args) {

		openConnection();
		transaction.begin();

		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Anil");
		employee.setSalary(25000);

		Laptop laptop = new Laptop();
		laptop.setSerialNo(123456);
		laptop.setBrand("apple");
		laptop.setAccessories("mouse & headset");

		employee.setLaptop(laptop);

		Address address = new Address();
		address.setFlatNo(604);
		address.setBulName("G12");
		address.setLandmark("Phase 2");
		address.setCity("pune");
		address.setState("maharashtra");
		address.setPincode(411026);

		Address address2 = new Address();
		address2.setFlatNo(610);
		address2.setBulName("H1");
		address2.setLandmark("Phase 10");
		address2.setCity("Moshi");
		address2.setState("delhi");
		address2.setPincode(420420);

		List<Address> arrayList = new ArrayList<>();
		arrayList.add(address);
		arrayList.add(address2);

		employee.setAddress(arrayList);

		manager.persist(address);
		manager.persist(address2);
		manager.persist(employee);
		manager.persist(laptop);

		transaction.commit();
		closeConnection();
	}
}
