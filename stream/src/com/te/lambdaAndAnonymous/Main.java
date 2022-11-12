package com.te.lambdaAndAnonymous;

public class Main {

	public static void main(String[] args) {
		// using anonymous object
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
				}

			}
		};

		// using lambda expression
		System.out.println("=====================");
		Runnable r1 = () -> {
			for (int i = 6; i < 10; i++) {
				System.out.println(i);
			}
		};

		Thread thread = new Thread(r);
		Thread thread1 = new Thread(r1);
		thread.start();
		thread1.start();

	}

}
