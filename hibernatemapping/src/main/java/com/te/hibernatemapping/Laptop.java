package com.te.hibernatemapping;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Laptop {

	@Id
	private int serialNo;
	private String brand;
	private String accessories;

}
