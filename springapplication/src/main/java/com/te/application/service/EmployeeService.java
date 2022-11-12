package com.te.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.application.EmployeeDemo;
import com.te.application.repo.Employee;
import com.te.application.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo emprepo;

	public void insert(EmployeeDemo empDemo) {
		emprepo.save(empDemo);
	}

	public Employee search(String empid) {
		return emprepo.search(empid);
	}

	public void update(Employee employee, String newName) {
		emprepo.update(employee, newName);
	}

	public boolean delete(String empid) {
		return emprepo.delete(empid);
	}

}
