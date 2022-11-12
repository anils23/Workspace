package com.jspiders.mvcproject1.controller;

import java.util.List;

import javax.persistence.metamodel.SetAttribute;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.jspiders.mvcproject1.dto.CustomerDTO;
import com.jspiders.mvcproject1.dto.EmployeeDTO;
import com.jspiders.mvcproject1.service.CustomerService;
import com.jspiders.mvcproject1.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/insert")
	public String insertEmployee() {
			return "InsertEmployee";

	}
	
	@PostMapping("/insert")
	public String insertData(@RequestParam String name,@RequestParam String email,@RequestParam String designation,@RequestParam String address,@RequestParam String phoneno, ModelMap map) {
			
					EmployeeDTO employee = service.insert(name, email, designation, address, phoneno);
					if (employee != null) {
						String message = "Data Inserted Sucessfully";
						map.addAttribute("msg",message);
						map.addAttribute("employee", employee);
						return "InsertEmployee";
					}
					return "InsertEmployee";


	}
	
	@GetMapping("/about")
	public String about( ModelMap map) {
			return "about";

	}


	@GetMapping("/remove")
	public String removeEmployee(ModelMap map,  @SessionAttribute(name = "login", required = false) EmployeeDTO login) {
		
			List<EmployeeDTO> employees = service.findAllEmployees();
			map.addAttribute("employeeList", employees);

			return "RemoveEmployee";

	}
	
	@PostMapping("/remove")
	public String removeData(@RequestParam(value ="id", required = true) int empid, ModelMap map) {
	    
	    	EmployeeDTO remove = service.remove(empid);
	    	if (remove != null) {
	    		map.addAttribute("msg", "Employee removed successfully..!!");
				List<EmployeeDTO> employees = service.findAllEmployees();
				map.addAttribute("employeeList", employees);
			    return "RemoveEmployee";
			}
			map.addAttribute("msg1","Employee record not found...!!!" );
			List<EmployeeDTO> employees = service.findAllEmployees();
			map.addAttribute("employeeList", employees);
			return "RemoveEmployee";
		
	}

	@GetMapping("/update")
	public String updateEmployee(ModelMap map) {
			List<EmployeeDTO> employees = service.findAllEmployees();
			map.addAttribute("employeeList", employees);
			return "UpdateEmployee";

	}
	
	@PostMapping("/update")
	public String updateEmployee(@RequestParam(value ="id", required = true) int empid, ModelMap map) {
			
					EmployeeDTO update = service.update(empid);
					if (update != null) {
						map.addAttribute("update", update);
					}
					else {
						map.addAttribute("msg", "Employee record not found...!!!!");
						List<EmployeeDTO> employees = service.findAllEmployees();
						map.addAttribute("employeeList", employees);
						return "UpdateEmployee";
					}
					List<EmployeeDTO> employees = service.findAllEmployees();
					map.addAttribute("employeeList", employees);
					
					return "UpdateData";

	}
	
	@GetMapping("/login")
	public String login() {
		return "Login";	
	}
	
	@PostMapping("/login")
	public String logindata(@RequestParam String username, @RequestParam String password, ModelMap map, HttpServletRequest request, HttpSession session) {
		String name = "admin";
		String pass = "1234";
		if (username.equals(name) && password.equals(pass)) {
			return "loginData";
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
	
	@PostMapping("/updatedata")
	public String updatedata(@RequestParam int empid,@RequestParam String name,@RequestParam String email,@RequestParam String designation,@RequestParam String address,@RequestParam String phoneno, ModelMap map) {
					service.updatedata(empid, name, email, designation, address, phoneno);
					
					map.addAttribute("msg1","Data Updated Successfully...!!!");	
					List<EmployeeDTO> employees = service.findAllEmployees();
					map.addAttribute("employeeList", employees);
					return "UpdateEmployee";


	}

	@GetMapping("/homepage")
	public String homepage() {
			return "loginData";
	}
	
	@GetMapping("/insertCustomer")
	public String insertCustomer() {
		return "InsertCustomer";
	}

	@PostMapping("/insertCustomer")
	public String insertCustomer(@RequestParam String name,@RequestParam String email,@RequestParam String hairstyle,@RequestParam double productcharges,@RequestParam double servicecharges, ModelMap map) {
					CustomerDTO customer = customerservice.insert(name, email, hairstyle,productcharges, servicecharges);
					if (customer != null) {
						String message = ":::THANKYOU && VISITAGAIN:::";
						map.addAttribute("msg",message);
						map.addAttribute("customer", customer);
						return "InsertCustomer";
					}
					return "InsertCustomer";


	}
	@GetMapping("/history")
	public String history(ModelMap map) {
			List<CustomerDTO> customer = customerservice.findAllcustomers();
			map.addAttribute("customerList", customer);
			return "customerData";

	
	}
}