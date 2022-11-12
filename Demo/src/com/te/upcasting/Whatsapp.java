package com.te.upcasting;

public class Whatsapp {

	public static void main(String[] args) {

		User user = new User();
		user.name = "anil";
		user.phoneNumber = 1234567990;
		System.out.println(user.name);
		System.out.println(user.phoneNumber);
		user.call("sanjay");
		user.text("sanjay");
		System.out.println("===============================");

		/*
		 * Admin admin = (Admin) user; admin.addUser("phushpa");
		 */

		User user1 = new Admin();
		user1.name = "Rocky";
		user1.phoneNumber = 546978231;
		user1.call("xyz");
		user1.text("xyz");

		Admin admin = (Admin) user1;
		admin.addUser("Srivalli");
		
		

	}

}
