package com.te.wrapper.unboxing;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test1 {
	
	public static void main(String[] args) {
		
		Integer obj = 10;
		int a = obj.intValue(); // using value().
		System.out.println(a);
		
		Boolean obj1 = true;
		boolean b1=obj1;       // directly from JDK 1.5 
		System.out.println(b1);
		
		String s = "true";
		boolean  b = Boolean.parseBoolean(s); // using parseBoolean()
		System.out.println(b);		
	
        
        
	
	}
	
	
	
    

}
