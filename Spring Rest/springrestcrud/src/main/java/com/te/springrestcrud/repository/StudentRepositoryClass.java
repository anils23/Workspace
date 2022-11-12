package com.te.springrestcrud.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springrestcrud.dto.StudentDTO;

@Repository
public class StudentRepositoryClass implements StudentRepositoryInterface {

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

	@Override
	public StudentDTO insert(StudentDTO dto) {
		openConnection();
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		closeConnection();
		return dto;
	}

	@Override
	public StudentDTO search(String rollno) {
		openConnection();
		StudentDTO student = manager.find(StudentDTO.class, rollno);
		closeConnection();
		return student;
	}

	@Override
	public StudentDTO update(String name, String rollno) {
		openConnection();
		StudentDTO student = manager.find(StudentDTO.class, rollno);
		if (student != null) {
			student.setName(name);
			manager.persist(student);
			transaction.begin();
			transaction.commit();
		}
		return student;

	}

	@Override
	public boolean delete(String rollno) {
		openConnection();
		StudentDTO find = manager.find(StudentDTO.class, rollno);
		if (find != null) {
			manager.remove(find);
			transaction.begin();
			transaction.commit();
			return true;
		}
		return false;

	}

	@Override
	public List<StudentDTO> getAllStudents() {
		openConnection();
		Query createQuery = manager.createQuery("from StudentDTO");
		List resultList = createQuery.getResultList();
		return resultList;
	}

}
