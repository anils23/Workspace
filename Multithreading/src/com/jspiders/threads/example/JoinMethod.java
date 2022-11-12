package com.jspiders.threads.example;

public class JoinMethod {
	
	public static void main(String[] args) {

		Runnable r1=()-> {
			for (int i = 0; i < 10; i++) {
	        System.out.println("1st Thread executed ");				
			}
		};
		Runnable r2=()-> {
			for (int i = 0; i < 10; i++) {
	        System.out.println("2nd Thread executed");				
			}
		};
		Runnable r3=()-> {
			for (int i = 0; i < 10; i++) {
	        System.out.println("3rd Thread executed");				
			}
		};
		Runnable r4=()-> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("4th Thread executed");
		};
		
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		Thread t4=new Thread(r4);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		t4.start();

	}

}
