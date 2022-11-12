package com.te.application.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.te.application.EmployeeDemo;

@Repository
public class EmployeeRepo {

	@Autowired
	Employee emp;

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("springapplication");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();

	public void save(EmployeeDemo empDemo) {

		emp.setName(empDemo.getName());
		emp.setDesignation(empDemo.getDesignation());
		emp.setAge(Integer.parseInt(empDemo.getAge()));
		emp.setSalary(Double.parseDouble(empDemo.getSalary()));

		transaction.begin();
		manager.persist(emp);
		transaction.commit();
	}

	public Employee search(String empid) {
		return manager.find(Employee.class, Integer.parseInt(empid));

	}

	public void update(Employee employee, String newName) {
		transaction.begin();
		employee.setName(newName);
		manager.persist(employee);
		transaction.commit();
	}

	public boolean delete(String empid) {
		transaction.begin();
		Employee find = manager.find(Employee.class,Integer.parseInt(empid));
		if (find != null) {
			manager.remove(find);
			transaction.commit();
            return true;			
		}
		return false;
	}
	
	public void listAllEmployee() {
		Query createQuery = manager.createQuery("from Employee");
		List resultList = createQuery.getResultList();
		
		
	}

}
