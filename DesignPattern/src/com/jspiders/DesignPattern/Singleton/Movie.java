package com.jspiders.DesignPattern.Singleton;

public class Movie {
	
	static int tickets=50;
	static Movie movie = null;
	
	private Movie() {
		System.out.println("Total No of Tickets are :"+tickets);
	}

	
	public static Movie booking(int a) {
		
		if (movie==null) {
			movie=new Movie();	
		}
		if(tickets>0) {
		tickets=tickets-a;
		System.out.println("Total no of tickets needed is :"+a);
		System.out.println("Remaining tickets are :"+tickets);
		}
		System.out.println("all tickets sold");
		return movie;
		}
		
	
}
