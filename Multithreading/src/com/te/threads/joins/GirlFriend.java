package com.te.threads.joins;

public class GirlFriend extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("On my way........");
		}

	}

}
