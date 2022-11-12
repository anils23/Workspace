package com.te.threads.synchronizedBlock;

public class User extends Thread{
	
	String name;
	int tickets;
	Irctc irctc;
	
	public User(String name, int tickets, Irctc irctc) {
		super();
		this.name = name;
		this.tickets = tickets;
		this.irctc = irctc;
	}
	
	@Override
	public void run() {
        irctc.bookTickets(tickets, name);
	}

}
