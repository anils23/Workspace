package com.jspiders.Serailisation.example;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3139463504639862850L;
	String name;
	String mail;

	public Employee(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}

}
