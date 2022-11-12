package com.te.springReplicate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile1.xml");
		Test bean = ctx.getBean(Test.class);
		bean.test();
		ctx.close();
	}
}
