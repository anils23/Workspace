package com.jspiders.DesignPattern.Factory;

public class HomeLoan implements BankLoan {
	
	public void loan() {
		System.out.println("The Home Loan Interest Rate is 6.75 %");
	}

}
