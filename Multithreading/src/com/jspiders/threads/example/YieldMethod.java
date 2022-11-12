package com.jspiders.threads.example;

public class YieldMethod {
	
	public static void main(String[] args) {
		
		Runnable r1=()-> {
			Thread.yield();
			for (int i = 0; i < 50; i++) {
	        System.out.println("1st Thread executed");				
			}
		};
		Runnable r2=()-> {
			for (int i = 0; i < 50; i++) {
	        System.out.println("2nd Thread executed");				
			}
		};
		Runnable r3=()-> {
			for (int i = 0; i < 50; i++) {
	        System.out.println("3rd Thread executed");				
			}
		};
		
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		t2.setPriority(10);
		
	}
	

}
