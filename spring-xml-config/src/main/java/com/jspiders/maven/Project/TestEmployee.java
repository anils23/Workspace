package com.jspiders.maven.Project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jspiders/maven/Project/NewFile.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
		ctx.close();
	}

}
