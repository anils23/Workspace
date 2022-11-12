package com.jsipders.maven.spring.springexample;

public class Bank {

	private String bank_Name;
	private String ifsc;
	private int no_of_customer;
	
	public String getBank_Name() {
		return bank_Name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public int getNo_of_customer() {
		return no_of_customer;
	}
	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public void setNo_of_customer(int no_of_customer) {
		this.no_of_customer = no_of_customer;
	}
	@Override
	public String toString() {
		return "Bank [bank_Name=" + bank_Name + ", ifsc=" + ifsc + ", no_of_customer=" + no_of_customer + "]";
	}
	
	
	
	
}
