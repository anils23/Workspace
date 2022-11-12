package com.jspiders.threads.example;

public class ThreadID {

	public static void main(String[] args) {

		Runnable r1 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("1ST THREAD EXECUTED");
			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("2ND THREAD EXECUTED");
			}
		};

		Runnable r3 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("3RD THREAD EXECUTED");
			}
		};

		Runnable r4 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("4TH THREAD EXECUTED");
			}
		};

		Runnable r5 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("5TH THREAD EXECUTED");
			}
		};
		Runnable r6 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("6TH THREAD EXECUTED");
			}
		};

		Runnable r7 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("7TH THREAD EXECUTED");
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		Thread t6 = new Thread(r6);
		Thread t7 = new Thread(r7);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();

		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t3.getId());
		System.out.println(t4.getId());
		System.out.println(t5.getId());
		System.out.println(t6.getId());
		System.out.println(t7.getId());

	}
}
