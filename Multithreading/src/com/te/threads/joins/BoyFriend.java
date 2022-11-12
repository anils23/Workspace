package com.te.threads.joins;

public class BoyFriend {

	public static void main(String[] args) {

		GirlFriend girlFriend = new GirlFriend();
		Thread.currentThread().setName("boyfriend");
		girlFriend.setName("girlfriend");
		girlFriend.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("hello ... come fast");
		}
		try {
			girlFriend.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("They met");
		System.out.println("Arrived at restaurant");
		System.out.println("They has icecream");

	}
}
