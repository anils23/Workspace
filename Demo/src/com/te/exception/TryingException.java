package com.te.exception;

import java.util.Scanner;

public class TryingException {
	
	public static void main(String[] args) {
		
	
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c=0;
		int x[]= {1,2,3,4};
		
		String an ="anil";
		
		
		
		 try {
			 c=a/b;
			 System.out.println(x[c]);
			
		} catch (ArithmeticException e) {
			System.out.println("Arthemetic exception handed");
			System.exit(0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOOfBound exception handled");
		}finally {
			 if (scanner != null) {
				 scanner.close();				
			 }
		 System.out.println(c);
		}
				
				
	}

}
