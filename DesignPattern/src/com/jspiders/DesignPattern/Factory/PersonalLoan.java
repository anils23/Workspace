package com.jspiders.DesignPattern.Factory;

public class PersonalLoan implements BankLoan {
	
	public void loan() {
		System.out.println("The Personal Loan Interest Rate is 16 %");
	}


}
