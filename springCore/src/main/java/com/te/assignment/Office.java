package com.te.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Office {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
		
		System.out.println("======================Assignment 1====================");
		
		Employee bean = ctx.getBean("emp1",Employee.class);
		System.out.println(bean);
		
		Employee bean2 = ctx.getBean("emp2",Employee.class);
		System.out.println(bean2);
		
		System.out.println("======================Assignment 2====================");
		
		Employee bean3 = ctx.getBean("emp3", Employee.class);
		System.out.println(bean3);
		
		System.out.println("======================Assignment 3====================");
		
		Employee bean4 = ctx.getBean("emp4",Employee.class);
		System.out.println(bean4);
		
		System.out.println("===================List of Employee=======================");
		Employee bean5 = ctx.getBean("abcd", Employee.class);
		bean5.getList().stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		

		
		
		
		
	}

}
