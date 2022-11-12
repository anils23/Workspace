package com.te.springReplicate;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {
	
	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Test() {
		System.out.println("constructor");
	}

	public void test() {
		System.out.println("test method form Test class...!!!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destruction");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing");
	}

}
