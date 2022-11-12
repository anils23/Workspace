package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.Battery;
import com.te.springboot.dto.Laptop;
import com.te.springboot.dto.UpdateDTO;
import com.te.springboot.service.LaptopServiceInterface;

@RestController
public class MyController {
	
	@Autowired
	LaptopServiceInterface service;

	@PostMapping("/adddata")
	public Laptop test(@RequestBody Laptop laptop) {
		 Laptop add = service.add(laptop);
		return add;
	}
	
	@GetMapping("/find")
	public Laptop search(@RequestParam Integer serialno) {
		Laptop search = service.search(serialno);
		return search;	
	}
	
	@PostMapping("/delete")
	public void Laptop(@RequestParam Integer serialno) {
		service.delete(serialno);
	}
	
	@PostMapping("/update")
	public Laptop update(@RequestParam Integer serialno, String name) {
		Laptop update = service.update(serialno, name);
		return update;
	}
	
	@PostMapping("/updatedata")
	public Laptop updatedata(@RequestBody UpdateDTO update) {
		Laptop updatebattery = service.updatebattery(update);
		return updatebattery;
	}
	
}
