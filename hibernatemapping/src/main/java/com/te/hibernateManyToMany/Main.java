package com.te.hibernateManyToMany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	static EntityManagerFactory factory;
	static EntityManager manager;
	static EntityTransaction transaction;

	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate1");
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
		
		Students students = new Students();
		students.setName("Anil thapa");
		
		Students students2 = new Students();
		students2.setName("Sanjay thapa");
		
		Trainers trainers = new Trainers();
		trainers.setTrainerName("Ajay bennur");
		trainers.setSubject("Spring & Spring boot");
	
		Trainers trainers2 = new Trainers();
		trainers2.setTrainerName("Dharashan");
		trainers2.setSubject("Java");
		
		List<Students> asList = Arrays.asList(students,students2);
		List<Trainers> asList2 = Arrays.asList(trainers, trainers2);
		
		students.setTrainers(asList2);
		trainers.setStudents(asList);
		
		manager.persist(students);
		manager.persist(students2);
		
		transaction.commit();
		closeConnection();
		
		
		
	}

	

}
