package com.te.variables;

public class Practice {
	static int x = 100;
	int y = 200;
	
	public static void main(String[] args) {
	
     Practice p1 = new Practice();
     Practice p2 = new Practice();
     System.out.println(p1.x);
     System.out.println(p1.y);
     System.out.println(p2.x);
     System.out.println(p2.x);
     p1.x=200;
     p2.y=300;
     p1.x=500;
     Practice p3 = new Practice();
     System.out.println(p1.x);
     System.out.println(p2.x);
     System.out.println(p3.x);
     
	}
}
