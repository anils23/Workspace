package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
		factory.close();
		manager.close();

	}

	public static void main(String[] args) {

		openConnection();
		transaction.begin();

		Employee employee = new Employee();
		employee.setId(103);
		employee.setName("sdvaw");
		employee.setGender("male");
		employee.setAge(32);
		employee.setSalary(1500);
	
		Address address = new Address();
		address.setBulNo(105);
		address.setBulName("G12 Phase2");
		address.setPincode(412105);

		employee.setAddress(address);

		manager.persist(address);
		manager.persist(employee);               
		transaction.commit();

		closeConnection();

	}
}
