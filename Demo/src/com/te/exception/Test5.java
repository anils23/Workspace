package com.te.exception;

public class Test5 {
	
	public void m1() {
		try {
			m2(1);
		}catch (Exception e) {
           System.out.println("Exception handled");
		}
	}
	public void m2(int number) throws Exception{
		if (number == 1) {
		throw new Exception();  // auto propagating process for checked exception, transferring control to caller
	}else{
		System.out.println(number);
	}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("program start");
		new Test5().m1();
		System.out.println("program end");
	}

}
