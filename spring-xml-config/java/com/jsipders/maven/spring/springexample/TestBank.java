package com.jsipders.maven.spring.springexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("com/jsipders/maven/spring/springexample/springconfig.xml");
		Bank b=(Bank) ctx.getBean("bank");
		System.out.println(b);
	}

}
