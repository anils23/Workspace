package com.tespringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Autowired
	UserRepo repo;
	
	public boolean check(User user) {
		if (user.getPassword().equals(user.getRetype_password())) {
			repo.save(user);
			return true;
		}
		return false;
	}

}
