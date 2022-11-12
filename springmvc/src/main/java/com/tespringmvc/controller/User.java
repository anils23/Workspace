package com.tespringmvc.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
public class User {
	
	@Id
	private String email;
	private String username;
	private String password;
	private String retype_password;

}
