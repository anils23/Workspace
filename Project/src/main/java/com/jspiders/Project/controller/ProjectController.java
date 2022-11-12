package com.jspiders.Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {
	

	@GetMapping("/login")
	public String login() {
		return "Login";	
	}
	
	@PostMapping("/login")
	public String logindata(@RequestParam String username, @RequestParam String password, ModelMap map) {
		String name = "admin";
		String pass = "1234";
		if (username.equals(name) && password.equals(pass)) {
			return "Home";
		}
		else {
		map.addAttribute("msg", "Invalid Username or password");
		return "Login";
		}
	}
	
	@GetMapping("/logout")
	public String logout(ModelMap map) {
		map.addAttribute("msg","Logout Sucessfully...!!!");
		return "Login";	
	}
	
	@GetMapping("/about")
	public String about() {
		return "About";	
	}
	@GetMapping("/machinestock")
	public String machinestock() {
		return "MachineStock";	
	}
	@GetMapping("/castingstock")
	public String castingstock() {
		return "CastingStock";	
	}
	@GetMapping("/assembly")
	public String assembly() {
		return "Assembly";	
	}
	@GetMapping("/machine")
	public String machining() {
		return "Machine";	
	}
	@GetMapping("/inward")
	public String inward() {
		return "Inward";	
	}
	@GetMapping("/home")
	public String home() {
		return "Home";	
	
	}
}
