package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	private int bulNo;
	private String bulName;
	private int pincode;

}
