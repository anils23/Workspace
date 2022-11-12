package com.te.practice;

import java.io.IOException;
import java.util.logging.Logger;

public class Process {
	
	public static final Logger LOGGER = Logger.getLogger("com.te.phonePe");
	
	public static void main(String[] args) throws SecurityException, IOException {
		
		User anil = new User("anil", 7507424458l, 25000);
		User sanjay = new User("sanjay", 9762415134l, 20000);
		
		PhonePe phonePe = new PhonePe();
		
		phonePe.user.add(anil);
		phonePe.user.add(sanjay);
		
		phonePe.sendMoney(9762415134l, 25000);
		LOGGER.finest("Thank You for using PhonePe...!!!");
	
		
	}

}
