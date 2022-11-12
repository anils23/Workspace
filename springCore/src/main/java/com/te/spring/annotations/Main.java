package com.te.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Screen.xml");
		Mobile bean = ctx.getBean(Mobile.class);
		System.out.println(bean);
		bean.getSim().company();
  
	}

}
