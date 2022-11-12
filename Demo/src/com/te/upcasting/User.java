package com.te.upcasting;

public class User {
	
	String name;
	long phoneNumber;
	
	public void call(String name) {
		System.out.println(name +"is calling");
	}
	
	public void text(String name) {
		System.out.println(name +"is texting");
	}

}
