package com.te.streams;

public class News {
	
	public static void main(String[] args) {
		
		Runnable r = ()->{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1");				
		};
		
		Runnable r1 = ()->{
			System.out.println("Thread 1");
		};
		
		Runnable r2 = ()->{
			System.out.println("Thread 1");
		};
		
		Runnable r3 = ()->{
			System.out.println("Thread 1");
		};
		
		Thread thread = new Thread(r);
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		Thread thread3 = new Thread(r3);
		thread.start();
		thread2.start();
		thread3.start();
		thread1.start();
		
	}

}
