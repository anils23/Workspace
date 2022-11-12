package com.te.application;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EmployeeDemo {
	
	private String name;
	private String designation;
	private String age;
	private String salary;

}
