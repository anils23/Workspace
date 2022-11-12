package com.jspiders.DesignPattern.Singleton;

public class Bank {

	private static Bank obj = null;

	 
	private Bank() {
		System.out.println("Account Created for account no - 12345678910");
	}
	
	
	public static Bank account()
	{
		if (obj==null) {
			obj=new Bank();
			return obj;
		}
		System.out.println("Account Already Exist");
		return obj;	
	}
}
