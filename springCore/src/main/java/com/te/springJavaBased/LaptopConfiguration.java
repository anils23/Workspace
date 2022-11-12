package com.te.springJavaBased;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class LaptopConfiguration {

//	@Bean(autowire = Autowire.BY_NAME)
//	public Laptop createLaptop() {
//
//		Laptop laptop = new Laptop();
//		laptop.setBrand("ASUS");
//		laptop.setPrice(33000);
//		laptop.setProcessor("I3 10 gen");
//		return laptop;
//	}
//
//	@Bean(name = "battery1")
//	public Battery createBattery() {
//		return new Battery("Intex", 10, "black");
//	}
//	
//	@Bean(name = "battery")
//	public Battery createBattery1() {
//		return new Battery("Samsung", 15, "white");
//	}
	
	@Bean 
	@Scope("prototype")
	public Laptop createLaptop() {
		return new Laptop("Asus",33000,"I3 10 gen");
	}
	

}
