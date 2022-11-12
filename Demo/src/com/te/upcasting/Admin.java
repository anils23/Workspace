package com.te.upcasting;

public class Admin extends User {
	
	public void addUser(String name) {
		System.out.println(name +" added...");
	}

	public void removeUser(String name) {
		System.out.println(name +"removed....");
	}

}
