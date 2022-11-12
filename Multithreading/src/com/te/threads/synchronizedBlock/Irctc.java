package com.te.threads.synchronizedBlock;

public class Irctc {
	
	int noOfTickets = 100;
	
	public void bookTickets(int tickets, String name) {
		System.out.println("Welcome to irctc "+ name);
		synchronized (this) {
			if (noOfTickets>tickets) {
				noOfTickets -= tickets;
				System.out.println("Thank you for booking  "+ name);
			}else {
				System.out.println("sorry ur late");
				return;
			}
			
			System.out.println("no of Tickets remaining " + noOfTickets);			
		}
		}

}
