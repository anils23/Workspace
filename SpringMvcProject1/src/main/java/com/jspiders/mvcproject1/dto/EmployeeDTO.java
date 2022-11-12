package com.jspiders.mvcproject1.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employee_data")
public class EmployeeDTO implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3119905653318806586L;

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private int empid;
	
	private String name;
	
	private String email;
	
	private String designation;
	
	private String address;
	
	private String phoneno;


}
