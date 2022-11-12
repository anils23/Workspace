package com.te.springboot.advicer;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.springboot.customexception.DataNotFoundException;
import com.te.springboot.dto.Laptop;

@ControllerAdvice
public class MyControllerAdvicer {

	@ExceptionHandler(value = RuntimeException.class)
	public Laptop add() {
		return new Laptop();
	}
	
}
