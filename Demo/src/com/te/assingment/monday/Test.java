package com.te.assingment.monday;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String team[] = new String[12];
		System.out.println("Enter the names of playing 11");
		int j = 1;
		for (int i = 0; i < 11; i++) {
			System.out.print("Player " + j + ":");
			team[i] = scanner.next();
			j++;
			if (i == 10) {
				try {
					throw new PlayerException("Only 11 Players are allowed");
				} catch (PlayerException e) {
					System.out.println(e.getMessage());
				}
			} else {

			}
		}
		System.out.println("=================================");
		System.out.println("The Selected Players are");
		for (int i = 0; i < team.length - 1; i++) {
			System.out.println(team[i]);
		}

		if (scanner != null) {
			scanner.close();
		}
	}

}
