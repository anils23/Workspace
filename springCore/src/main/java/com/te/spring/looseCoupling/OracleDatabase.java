package com.te.spring.looseCoupling;

public class OracleDatabase implements Database {

	@Override
	public void save() {
		System.out.println("This is Oracle Database");
	};

}
