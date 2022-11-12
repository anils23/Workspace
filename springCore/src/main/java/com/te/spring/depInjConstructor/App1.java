package com.te.spring.depInjConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springxml.xml");
		User1 bean = ctx.getBean("bean3",User1.class);
		System.out.println(bean);
	}

}
