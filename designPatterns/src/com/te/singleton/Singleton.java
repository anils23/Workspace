package com.te.singleton;

public class Singleton {
	
	static Singleton obj = null;
	
	
	private Singleton(){
		
	}
	
	public static Singleton createObject() {
		
		if (obj==null) {
			obj= new Singleton();
			System.out.println("Object created");
			return obj;
		}else {
			System.out.println("Object already created");
			return obj;
		}
	
		
		
	}

}
