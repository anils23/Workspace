package com.te.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//		Amir bean = ctx.getBean(Amir.class);
//		System.out.println(bean);

//		Demo bean2 = ctx.getBean(Demo.class); // obj1
//		System.out.println(bean2);
//		Demo bean3 = ctx.getBean(Demo.class); // same object because scope is by deafault singleton if we want to create
//												// multiple object we need to change scope to prototype.
//		System.out.println(bean3);

		
		Amir bean = ctx.getBean("Amir", Amir.class);
		System.out.println(bean.getList());
		
	}
}
