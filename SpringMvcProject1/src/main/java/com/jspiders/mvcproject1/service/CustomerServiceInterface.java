package com.jspiders.mvcproject1.service;

import java.util.List;

import com.jspiders.mvcproject1.dto.CustomerDTO;


public interface CustomerServiceInterface {

	CustomerDTO insert(String name, String email, String hairstyle, double productcharges, double servicecharges);

	List<CustomerDTO> findAllcustomers();
}
