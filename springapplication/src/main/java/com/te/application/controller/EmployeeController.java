package com.te.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.application.EmployeeDemo;
import com.te.application.repo.Employee;
import com.te.application.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/forHome")
	public String forHome() {
		return "home";
	}
	
	@GetMapping("/login")
	public String forLogin() {
		return "login";
	}

	@PostMapping("/login")
	public String afterLogin(@RequestParam String username, @RequestParam String password, Model model) {

		if (username.equals("anil") && password.equals("123")) {
			return "home";
		}
		model.addAttribute("msg", "Invalid username or password..!!!");
		return "login";
	}

	@GetMapping("/add")
	public String addEmployee() {
		return "addEmployee";
	}

	@PostMapping("/addEmployee")
	public String insertEmployee(@ModelAttribute EmployeeDemo empDemo, Model model) {
		service.insert(empDemo);
		model.addAttribute("msg", "Data inserted successfull...!!!");
		return "addEmployee";
	}

	@GetMapping("/find")
	public String updateEmployee() {
		return "find";
	}

	@PostMapping("/search")
	public String searchEmployee(@RequestParam String empid, ModelMap model) {
		Employee employee = service.search(empid);
		if (employee != null) {
			model.addAttribute("emp", employee);
			return "findData";
		}
		model.addAttribute("msg", "Employee not found...!!!");
		return "find";
	}

	@GetMapping("/update")
	public String update() {
		return "update";
	}

	Employee search;

	@PostMapping("/update")
	public String updateData(@RequestParam String empid, ModelMap map) {
		search = service.search(empid);
		if (search != null) {
			map.addAttribute("emp", search);
			return "update";
		}
		map.addAttribute("msg", "Employee not found...!!!");

		return "update";
	}

	@PostMapping("/updateData")
	public String updateD(@RequestParam String newName, Model model) {
		service.update(search, newName);
		model.addAttribute("msg2", "Employee Updated...!!!");
		return "update";
	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}


	@PostMapping("/deleteData")	
	public String deleteData(@RequestParam String empid, ModelMap map) {
		boolean delete = service.delete(empid);
		if (delete) {
			map.addAttribute("msg", "Employee Delete Successfully...!!!");
		} else {
			map.addAttribute("msg1", "Employee Not Found...!!!");
		}
		return "delete";
	}

}
