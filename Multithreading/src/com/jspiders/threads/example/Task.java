package com.jspiders.threads.example;
public class Task {
  
	
	public static void main(String[] args) {
	 
		int a=10000;
		
		Runnable r1=()->{
	
			if (a==10000)
			{
				System.out.println("He has VIP pass");
			}
			else
			{
				System.out.println("He has Normal pass");
			}		
		};
		
		
		Runnable r2=()->{
			
			if (a==10000)
			{
				System.out.println("He has VIP pass");
			}
			else
			{
				System.out.println("He has Normal pass");
			}		
		};
		
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();


		
		
		
	}
	
	
}
