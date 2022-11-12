package com.te.springboot.customexception;

public class DataNotFoundException extends RuntimeException {
	
	public DataNotFoundException(String msg) {
         super(msg);
	}

}
