package com.te.exception;

public class Test4 {
	
	public void m1() {
		try {
			m2();
		}catch (Exception e) {
           System.out.println("Exception handled");
		}
	}
	public void m2() {
		throw new RuntimeException();  // auto propagating process for unchecked exception, transferring control to caller
	}
	
	
	public static void main(String[] args) {
		System.out.println("program start");
		new Test4().m1();
		System.out.println("program end");
	}

}
