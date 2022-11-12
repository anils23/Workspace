package com.jspiders.mvcproject1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jspiders.mvcproject1.dto.EmployeeDTO;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface{
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("hibernate");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
	}
	
	public static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();	
		}		
	    
	}
	

	@Override
	public EmployeeDTO insert(String name, String email, String designation, String address, String phoneno) {
		
		openConnection();
		transaction.begin();
		
		EmployeeDTO employee = new EmployeeDTO();
		employee.setName(name);
		employee.setEmail(email);
		employee.setDesignation(designation);
		employee.setAddress(address);
		employee.setPhoneno(phoneno);
		
		manager.persist(employee);
		
		transaction.commit();
		
		closeConnection();
		
		return employee;
	}

	@Override
	public EmployeeDTO search(int empid) {
		openConnection();
		transaction.begin();
		
		EmployeeDTO find = manager.find(EmployeeDTO.class, empid);
		closeConnection();
		
		return find;
	}

	@Override
	public void remove(int empid) {
		openConnection();
		
		transaction.begin();
		
		EmployeeDTO find = manager.find(EmployeeDTO.class, empid);
		
		manager.remove(find);
		 
		transaction.commit();
		
		closeConnection();		
	}

	public List<EmployeeDTO> findAllEmployees() {
		openConnection();

		transaction.begin();

		String jpql = "from EmployeeDTO";

		Query query = manager.createQuery(jpql);
		List<EmployeeDTO> list = query.getResultList();

		transaction.commit();

		closeConnection();

		return list;
	}

	@Override
	public EmployeeDTO update(int empid) {
		openConnection();
		transaction.begin();
		
		EmployeeDTO find = manager.find(EmployeeDTO.class, empid);
		
		closeConnection();
		return find;
	}

	@Override
	public EmployeeDTO updatedata(int empid, String name, String email, String designation, String address,
			String phoneno) {
		openConnection();
		transaction.begin();
		EmployeeDTO find = manager.find(EmployeeDTO.class, empid);
		find.setName(name);
		find.setEmail(email);
		find.setDesignation(designation);
		find.setAddress(address);
		find.setPhoneno(phoneno);
		manager.persist(find);
		transaction.commit();
		return find;
	}
	
	

	

}
