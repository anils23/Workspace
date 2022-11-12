package com.jspiders.mvcproject1.dao;

import java.util.List;

import com.jspiders.mvcproject1.dto.EmployeeDTO;

public interface EmployeeDAOInterface {
	
	EmployeeDTO insert(String name, String email, String designation, String address, String phoneno);

	EmployeeDTO search(int empid);

	void remove(int empid);
	
	List<EmployeeDTO> findAllEmployees();
	
	EmployeeDTO update(int empid);
	
	EmployeeDTO updatedata(int empid,String name, String email, String designation, String address, String phoneno);


}
