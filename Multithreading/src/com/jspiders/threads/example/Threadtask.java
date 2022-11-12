package com.jspiders.threads.example;

public class Threadtask {

	public static void main(String[] args) {
		
		Runnable player1=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("This is player 1");
			}	
		};
		
		Runnable player2=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("This is player 2");
			}	
		};
		
		Runnable player3=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("This is player 3");
			}	
		};
		
		Runnable player4=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("This is player 4");
			}	
		};
		
		Runnable player5=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("This is player 5");
			}	
		};
		
		Runnable player6=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("This is player 6");
			}	
		};
		
		Thread t1= new Thread(player1);
		t1.start();
		Thread t2= new Thread(player2);
		t2.start();
		Thread t3= new Thread(player3);
		t3.start();
		Thread t4= new Thread(player4);
		t4.start();
		Thread t5= new Thread(player5);
		t5.start();
		Thread t6= new Thread(player6);
		t6.start();
	}
}
