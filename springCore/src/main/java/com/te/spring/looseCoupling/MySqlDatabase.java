package com.te.spring.looseCoupling;

public class MySqlDatabase implements Database {

	@Override
	public void save() {
		System.out.println("This is MySql Database");
	}

}
