package com.te.springJavaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext acc = new AnnotationConfigApplicationContext(LaptopConfiguration.class);
		
		Laptop bean = acc.getBean(Laptop.class);
		System.out.println(bean);
		
		Laptop bean1 = acc.getBean(Laptop.class);
		System.out.println(bean1);
		
	}

}
