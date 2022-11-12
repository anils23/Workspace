package com.te.variables;

public class Demo {

	public int a;
	private int b;
	protected int c;
	int d;
	
	public void m1() {
		System.out.println("This is a public method");
	}
	
	private void m2() {
		System.out.println("This is a private method");
	}

	protected void m3() {
		System.out.println("This is a protected method");
	}

	 void m4() {
		System.out.println("This is a defult method");
	}

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		System.out.println(demo.a);
		System.out.println(demo.b);
		System.out.println(demo.c);
		System.out.println(demo.d);
		demo.m1();
		demo.m2();
		demo.m3();
		demo.m4();
	}
}
