package com.te.spring.looseCoupling;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springxml.xml");
		User2 bean = ctx.getBean(User2.class);
		bean.getDatabase().save();
	}
}
