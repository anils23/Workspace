package com.jspiders.garbage.example;

public class HotelDriver {
	
	
	public static void main(String[] args) {
		
		Hotel a1=new Hotel("Wai Wai Chinese", "Indrayaninagar", 411026);
		
		System.out.println(a1.getName());
		System.out.println(a1.getAddress());
		System.out.println(a1.getPincode());
		a1.setName("New Hotel Name");
		System.out.println(a1.getName());
		a1.display();
		a1.items();
		a1=null;
		System.gc();
		System.out.println(a1.getName());
	}

}
