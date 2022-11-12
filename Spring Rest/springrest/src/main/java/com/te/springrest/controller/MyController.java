package com.te.springrest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrest.dto.EmployeeDTO;

@RestController
public class MyController {

	@GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDTO test() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpid(101);
		employeeDTO.setName("anil");
		employeeDTO.setDesignation("software engineer");
		return employeeDTO;
	}

	@PostMapping(path = "/run", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDTO run(@RequestBody EmployeeDTO emp) {
		System.out.println(emp);
		return emp;
	}
	List<EmployeeDTO> asList = Arrays.asList(new EmployeeDTO(101,"ironman","Man with iron heart"), new EmployeeDTO(102,"Captain America","First Avenger"), new EmployeeDTO(103,"Hulk","Smasher"), new EmployeeDTO(104,"Thor","Odin's son"));

	@GetMapping(path ="/check", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDTO run2(@RequestParam String checkname) {
		List<EmployeeDTO> collect = asList.stream().filter(t -> t.getName().equalsIgnoreCase(checkname)).collect(Collectors.toList());
		return collect.get(0);
	}

}
