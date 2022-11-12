package com.te.assingment.monday;

public class Reverse {
	
	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,5};
		int y[]=new int[x.length];
		
		for (int i = 0; i < x.length; i++) {
				y[i]=x[i];
		}
		
		int len = x.length-1;
		for (int i = 0; i < y.length; i++) {
		    x[i]=y[len];
		    len--;
		}
		
		// for Printing array
		for (int i = 0; i < y.length; i++) {
			System.out.println(x[i]);
		}
	
		
	}

}
