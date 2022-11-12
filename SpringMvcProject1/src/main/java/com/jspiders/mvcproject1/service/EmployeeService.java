package com.jspiders.mvcproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.mvcproject1.dao.EmployeeDAO;
import com.jspiders.mvcproject1.dto.CustomerDTO;
import com.jspiders.mvcproject1.dto.EmployeeDTO;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeDTO insert(String name, String email, String designation, String address, String phoneno) {
		EmployeeDTO employee = dao.insert(name, email, designation, address, phoneno);
		return employee;
	}

	@Override
	public EmployeeDTO search(int empid) {
		EmployeeDTO find = dao.search(empid);
		return find;
	}

	@Override
	public EmployeeDTO remove(int empid) {
		EmployeeDTO employee = dao.search(empid);
		if (employee != null) {
			dao.remove(empid);
			return employee;
		}
		return null;
	}

	@Override
	public List<EmployeeDTO> findAllEmployees() {
		List<EmployeeDTO> employees = dao.findAllEmployees();
		return employees;
	}


	@Override
	public EmployeeDTO update(int empid) {
		EmployeeDTO update = dao.update(empid);
		return update;
	}

	@Override
	public EmployeeDTO updatedata(int empid, String name, String email, String designation, String address,
			String phoneno) {
		EmployeeDTO updatedata = dao.updatedata(empid, name, email, designation, address, phoneno);
		return updatedata;
	}

	
	
	}


