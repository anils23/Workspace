package com.te.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PhonePe {
	
	public static final Logger LOGGER = Logger.getLogger("com.te.phonePe");

	List<User> user;
	
	public PhonePe() throws SecurityException, IOException {
      user = new ArrayList<>();
      forLogger();
	}
	
	public void forLogger() throws SecurityException, IOException {
		LOGGER.setLevel(Level.ALL);
		FileHandler fileHandler = new FileHandler("D:\\PhonePe.log");
		fileHandler.setLevel(Level.ALL);
		LOGGER.addHandler(fileHandler);
	}

	public void sendMoney(long phoneNo, double amount) {
		List<User> collect = user.stream().filter(u -> u.getPhoneNo() == phoneNo).collect(Collectors.toList());

		if (!collect.isEmpty()) {
			User user2 = collect.get(0);
			if (amount<user2.getBalance()) {
				double newBalance = user2.getBalance()-amount;
				user2.setBalance(newBalance);
				LOGGER.fine("Transaction Successfull...!!!" );
			}else {
				LOGGER.warning("Insuffient Funds...!!!");
				LOGGER.severe("Your balance is : "+user2.getBalance());
			}
		}else {
			LOGGER.warning("Please enter valid Phone Number");
		}
	}
	
	

}
