package com.te.springboot.service;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.customexception.DataNotFoundException;
import com.te.springboot.dto.Battery;
import com.te.springboot.dto.Laptop;
import com.te.springboot.dto.OperatingSystem;
import com.te.springboot.dto.UpdateDTO;
import com.te.springboot.repo.BatteryRepoInterface;
import com.te.springboot.repo.LaptopRepoInterface;

@Service
public class LaptopService implements LaptopServiceInterface {

	@Autowired
	LaptopRepoInterface repo;
	
	@Autowired
	BatteryRepoInterface batteryrepo;
	

	@Override
	public Laptop add(Laptop laptop) {
		Laptop save = repo.save(laptop);
		return save;
	}

	@Override
	public Laptop search(Integer serialno) {
		Optional<Laptop> findById = repo.findById(serialno);
		if (findById.isPresent()) {
			return findById.get();
		}
	 throw new RuntimeException("Data Not found...!!!");
	}

	@Override
	public void delete(Integer serialno) {
		repo.deleteById(serialno);
	}
	
	@Override
	public Laptop update(Integer serialno, String name) {
		Laptop laptop = repo.findById(serialno).get();
		laptop.setBrand(name);
		repo.save(laptop);
		return laptop;
	}

	@Override
	public Laptop updatebattery(UpdateDTO update) {
         Laptop laptop = repo.findById(update.getNo()).get();
        Battery battery = batteryrepo.findById(update.getId()).get();
        laptop.setBattery(battery);
   
	 return repo.save(laptop);
	}

}
