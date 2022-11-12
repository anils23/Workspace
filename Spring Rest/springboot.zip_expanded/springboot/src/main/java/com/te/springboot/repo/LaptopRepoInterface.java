package com.te.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.dto.Laptop;

@Repository
public interface LaptopRepoInterface extends CrudRepository<Laptop, Integer> {

}
