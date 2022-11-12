package com.te.threads.syn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Tonique {

	List<String> brand = Arrays.asList("Old Monk", "Oak Smith Gold", "Signature");
	int quantity = 10;

	public synchronized void buy(String name, int numberOfBottle) {

		Boolean b = brand.stream().anyMatch(x -> x.equals((String) name));
		if (b) {
			System.out.println("here is your brand " + name);
			System.out.println("Here are your Bottles, Don't drink and drive");
			quantity -= numberOfBottle;
		} else {
			System.out.println("Wait the stock will be refilled");
			try {
				this.wait();
				System.out.println("Thankx for waiting");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public synchronized void refillTheStock(String name, int quantity) {
		HashSet<String> hashSet = new HashSet<>(brand);
		hashSet.add(name);
		ArrayList<String> arrayList = new ArrayList<>(hashSet);
		brand = arrayList;
		this.notify();
	}

}
