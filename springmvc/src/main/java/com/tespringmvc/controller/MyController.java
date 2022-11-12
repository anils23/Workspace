package com.tespringmvc.controller;

import java.util.Arrays; 
import java.util.List;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@Autowired
    MyService service;
	
	@GetMapping("/login")
	public String login() {
		return "hello";
	}
	
	@PostMapping("/login")
	public String loginData(@RequestParam String name, @RequestParam String password, Model model) {
		
		model.addAttribute("username", name);
		return "loginData";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerdata(@ModelAttribute User user) {
		
		boolean check = service.check(user);
		if (check) {
			return "success";			
		}
		return "failure";
	}
	
	@PostMapping("/new")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/inbox")
	public String inbox() {  
		return "inbox";	
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	

}
