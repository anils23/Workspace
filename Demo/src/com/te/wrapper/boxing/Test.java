package com.te.wrapper.boxing;

public class Test {
	public static void main(String[] args) {
		
		int a = 10;
	    Integer obj= a;   // automatic process for JDK 1.5
	    System.out.println(obj);
	    
	    int b = 20;
	    Integer obj1 = Integer.valueOf(b); // using valueOf method
	    System.out.println(obj1);
	    
	    int c = 30;
	    String obj2 = String.valueOf(c); // converting int to String 
	    System.out.println(obj2);
	    
	}

}
