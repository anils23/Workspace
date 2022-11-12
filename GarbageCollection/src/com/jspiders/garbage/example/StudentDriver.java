package com.jspiders.garbage.example;

public class StudentDriver {
	
	public static void main(String[] args)
	{
		Student obj=new Student("baburao",25);
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj=null;
		System.gc();
		System.out.println(obj.age);
		
	}
	

}
