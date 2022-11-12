package com.te.encapsulation;

public class VoterMachine {
	public static void main(String[] args) {

		Voter voter = new Voter();
		voter.setName("Anil");
		voter.setId(101);
		voter.setAge(10);

		Voter voter1 = new Voter();
		voter1.setName("Sanjay");
		voter1.setId(102);
		voter1.setAge(19);

	}
}
