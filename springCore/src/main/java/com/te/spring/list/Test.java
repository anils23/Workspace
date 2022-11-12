package com.te.spring.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springxml.xml");
		Demo bean = ctx.getBean(Demo.class);
		System.out.println(bean);
	}

}
