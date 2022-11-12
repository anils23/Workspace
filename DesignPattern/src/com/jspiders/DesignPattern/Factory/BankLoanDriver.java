package com.jspiders.DesignPattern.Factory;

import java.util.Scanner;

public class BankLoanDriver {
	
	static int count;
	static BankLoan obj=null;
	static Scanner scanner=new Scanner(System.in);
	
	public static BankLoan factory() {
		System.out.println("Which Loan do you want");
		System.out.println(" 1.HomeLoan \n 2.CarLaon \n 3.PersonalLoan \n 4.GoldLoan \n 5.BusinessLoan");
		count=scanner.nextInt();
		switch (count) 
		   {
		case 1:
			obj = new HomeLoan();
			return obj;
		case 2:
			obj = new CarLoan();
			return obj;
		case 3:
			obj = new PersonalLoan();
			return obj;
		case 4:
			obj = new GoldLoan();
			return obj;
		case 5:
			obj = new BusinessLoan();
			return obj;

		default:
			System.out.println("Invalid Input");
			return obj;
		}
	}
	
	public static void main(String[] args) {
		
            try {
            	 factory().loan();
            } catch (NullPointerException e) {
	         System.out.println("Please Select valid Loan Account");
}
}
}
	
