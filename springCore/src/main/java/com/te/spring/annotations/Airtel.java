package com.te.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements SimCard {

	@Override
	public void company() {
		System.out.println("You are using airtel sim Card");		
	
	}

}