package com.jspiders.DesignPattern.Builder;

public class MobileMain {

	
	public static void main(String[] args) {
		
		Mobile mobile=new MobileBuilder().brand("Vivo").battery(5000).build();
		System.out.println(mobile);
	}
}
