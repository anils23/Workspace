package com.te.practice;

public class User {
	
	private String name;
	private long phoneNo;
	private double balance;
	private String upiId = name+"@"+phoneNo;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public User(String name, long phoneNo, double balance) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.balance = balance;
	}
	
	

}
