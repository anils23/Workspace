package com.te.threads.synchronizedBlock;

public class Tatkal {
	
	public static void main(String[] args) {
		Irctc irctc = new Irctc();
		User user = new User("amir", 65, irctc);
		User user2 = new User("darshan", 20, irctc);
		User user3 = new User("ravi", 20, irctc);
		User user4 = new User("jon", 20, irctc);
		
		user.start();
		user2.start();
		user3.start();
		user4.start();
		
		
	}

}
