package com.Jspider.synchronised;

public class synchronizedExample {

	static String s = "hello";

	public static void main(String[] args) {

		Runnable r1 = () -> {
			synchronized (s) {
				System.out.println("thread 1 locked");
				s = s + " Java";
				System.out.println(s);
			}
			System.out.println("thread 1 released");
		};

		Runnable r2 = () -> {
			synchronized (s) {
				System.out.println("thread 2 locked");
				s = s + " Python";
				System.out.println(s);
			}
			System.out.println("thread 2 released");
		};

		Runnable r3 = () -> {
			synchronized (s) {
				System.out.println("thread 3 locked");
				s = s + " J2EE";
				System.out.println(s);
			}
			System.out.println("thread 3 released");
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();

	}

}
