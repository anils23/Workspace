package com.te.exception.customexception;

public class Election {
	
	public static void vote(int age) {
		
		if (age<18) {
		try {
			throw new UserNotEligibleException("Sorry you are not eligible");
		}catch (UserNotEligibleException e) {
	      System.out.println(e.getMessage());
		}
		}else {
			System.out.println("You are eligible");
		}
	}
	
	
	public static void main(String[] args) {
		
		Voter voter = new Voter(01, "anil", 15);
		Voter voter2 = new Voter(02, "sanjay", 22);
		
	    Election.vote(voter.getAge());
	    Election.vote(voter2.getAge());
		
		
	}

}
