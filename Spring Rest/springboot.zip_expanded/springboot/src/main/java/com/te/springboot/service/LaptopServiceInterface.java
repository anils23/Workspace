package com.te.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.te.springboot.dto.Battery;
import com.te.springboot.dto.Laptop;
import com.te.springboot.dto.OperatingSystem;
import com.te.springboot.dto.UpdateDTO;

@Service
public interface LaptopServiceInterface {

	Laptop add(Laptop laptop);

	Laptop search(Integer serialno);
	
	void delete(Integer serialno);
	
	Laptop update(Integer serialno, String name);

	Laptop updatebattery(UpdateDTO update);
}
