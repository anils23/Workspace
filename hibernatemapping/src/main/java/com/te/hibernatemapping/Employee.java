package com.te.hibernatemapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private double salary;

	@OneToOne
	private Laptop laptop;
	
	@OneToMany
	private List<Address> address;

}
