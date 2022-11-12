package com.te.spring.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Idea implements SimCard {

	@Override
	public void company() {
		System.out.println("You are using Idea sim Card");
	 
	}

}
