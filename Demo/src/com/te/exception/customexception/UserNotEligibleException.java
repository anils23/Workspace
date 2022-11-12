package com.te.exception.customexception;

@SuppressWarnings("serial")
public class UserNotEligibleException extends Exception{
	
	public UserNotEligibleException(String message) {
		super(message);
	}

}
