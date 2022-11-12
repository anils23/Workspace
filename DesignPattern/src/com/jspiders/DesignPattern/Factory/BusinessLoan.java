package com.jspiders.DesignPattern.Factory;

public class BusinessLoan implements BankLoan {
	
	public void loan() {
		System.out.println("The Business Loan Interest Rate is 10 %");
	}


}
