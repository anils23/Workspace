package com.te.object;


public class Something extends Anil{
	

	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[] = new int[4];
		
	   for (int i = 0; i < b.length; i++) {
		b[i]=i+1;
		//System.out.println(b[i]);
	}
	   
	 
	   
	   
	   Object arr[]=new Object[2];
	   arr[0]=new Something();
	   arr[1]=new Anil();
	   
	   
//	   System.out.println(arr[0]);
//	   System.out.println(arr[1]);
	   
	   System.out.println(a);
	   
	}
}

