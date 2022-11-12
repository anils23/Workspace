package com.jspiders.mvcproject1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jspiders.mvcproject1.dto.CustomerDTO;
import com.jspiders.mvcproject1.service.CustomerServiceInterface;

@Repository
public class CustomerDAO implements CustomerServiceInterface {

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
	public CustomerDTO insert(String name, String email, String hairstyle, double productcharges,
			double servicecharges) {
		openConnection();
		transaction.begin();

		CustomerDTO customer = new CustomerDTO();
		customer.setName(name);
		customer.setEmail(email);
		customer.setHairstyle(hairstyle);
		customer.setProductcharges(productcharges);
		customer.setServicecharges(servicecharges);

		manager.persist(customer);

		transaction.commit();

		closeConnection();

		return customer;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerDTO> findAllcustomers() {
		openConnection();

		transaction.begin();

		String jpql = "from CustomerDTO";

		Query query = manager.createQuery(jpql);
		List<CustomerDTO> list1 = query.getResultList();

		transaction.commit();

		closeConnection();

		return list1;
	}

}
