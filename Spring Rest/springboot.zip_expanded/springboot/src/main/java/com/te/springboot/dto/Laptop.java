package com.te.springboot.dto;

import java.util.List; 

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Laptop {
	
	@Id
	private Integer serialno;
	private String brand;
	private String ram;
	private Double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Battery battery;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<OperatingSystem> operatingSystem;
}
