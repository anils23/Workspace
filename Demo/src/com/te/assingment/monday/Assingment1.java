package com.te.assingment.monday;

public class Assingment1 {

	public static void main(String[] args) {

//		String a = "anil";
//		String rev = "";
//		
//		for (int i = 0; i < a.length(); i++) {
//		 rev = a.charAt(i)+ rev;
//		}
//		System.out.println(rev);

//		========================================================================================
//		
		String a = "anil sitaram thapa";
		String rev = "";
		String[] split = a.split(" ");

		System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {
			rev = split[i] + " " + rev;
		}
		System.out.println(rev);

//		========================================================================================

//		int a[] = {15,25,5,2,98,65};
//		int temp;
//		for (int i = 0; i < a.length; i++) {
//		     for (int j = i+1; j < a.length; j++) {
//				if (a[i]>a[j]) {
//					temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//				
//			}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
	
	}

}
