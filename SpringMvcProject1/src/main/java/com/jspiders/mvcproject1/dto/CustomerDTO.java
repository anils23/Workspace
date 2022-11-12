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
@Table(name="customer_details")
public class CustomerDTO implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4482581639990459840L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billno;
	
	private String name;
	
	private String email;
	
	private String hairstyle;
	
	private double productcharges;
	
	private double servicecharges;

	
	
	
}
