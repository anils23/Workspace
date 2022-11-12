package com.te.exception.customexception2;

@SuppressWarnings("serial")
public class LowBalanceException extends RuntimeException{
	
	public LowBalanceException(String message) {
		super(message);
	}

}
