package com.jspiders.DesignPattern.Factory;

public class CarLoan implements BankLoan {
	
	public void loan() {
		System.out.println("The Car Loan Interest Rate is 12 %");
	}


}
