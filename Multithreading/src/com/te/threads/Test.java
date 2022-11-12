package com.te.threads;
// using thread class and overriding run method 
public class Test extends Thread{
	
	@Override
	public void run() {
       for (int i = 11; i <=20; i++) {
    	   if (i==14) {
			throw new RuntimeException();
		}
		System.out.println(i);
	}
	}
	
	public static void main(String[] args) {
		Thread test = new Test();
//		test.run();   It will execute only run method
		test.start();
		test.setName("abc");
		test.setPriority(MAX_PRIORITY);
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
	}

}
