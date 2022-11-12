package com.te.exception.customexception2;

public class Customer {

	private String name;
	private long accountno;
	private int balance;
	
	public Customer(String name, long accountno, int balance) {
		super();
		this.name = name;
		this.accountno = accountno;
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	
	
	
	
	
	
}
