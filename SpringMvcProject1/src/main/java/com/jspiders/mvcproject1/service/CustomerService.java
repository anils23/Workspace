package com.jspiders.mvcproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.mvcproject1.dao.CustomerDAO;
import com.jspiders.mvcproject1.dto.CustomerDTO;

@Service
public class CustomerService implements CustomerServiceInterface {
	
	@Autowired
	private CustomerDAO dao;

	@Override
	public CustomerDTO insert(String name, String email, String hairstyle, double productcharges, double servicecharges) {
		CustomerDTO customer = dao.insert(name, email, hairstyle, productcharges, servicecharges);
		return customer;
	}

	@Override
	public List<CustomerDTO> findAllcustomers() {
		List<CustomerDTO> customer = dao.findAllcustomers();
		return customer;
	}

}
