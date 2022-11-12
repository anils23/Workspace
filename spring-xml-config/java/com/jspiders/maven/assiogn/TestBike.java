package com.jspiders.maven.assiogn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=	new ClassPathXmlApplicationContext("com/jspiders/maven/assiogn/springconfig.xml");
	   Bike b= (Bike) ctx.getBean("bike");
	   System.out.println(b);
	}

}
