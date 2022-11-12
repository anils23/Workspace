package com.te.assingment.monday;

public class Difference {

	public static void main(String[] args) {

		int arr[] = { 1, 23, 5, 124, 501, 16, 500 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int diff = max - min;

		System.out.println("The largest number present in array is : " + max);
		System.out.println("The smallest number present in array is : " + min);
		System.out.println("The difference between largest and smallest number is : " + diff);

	}
}
