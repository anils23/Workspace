package com.te.spring.looseCoupling;

public class User2 {

	private Database database;

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "User [database=" + database + "]";
	}
	
}

