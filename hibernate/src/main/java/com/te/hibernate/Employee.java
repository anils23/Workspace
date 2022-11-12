package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp_details")
public class Employee {

	@Id
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	double abs;
    
	@OneToOne
	@JoinColumn(name ="Address")
	private Address address;


}
