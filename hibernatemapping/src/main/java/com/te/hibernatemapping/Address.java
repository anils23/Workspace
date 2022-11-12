package com.te.hibernatemapping;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	private int flatNo;
	private String bulName;
	private String landmark;
	private String city;
	private String state;
	private int pincode;

}
