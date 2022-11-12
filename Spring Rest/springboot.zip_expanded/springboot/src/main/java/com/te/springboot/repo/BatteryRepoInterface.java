package com.te.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.dto.Battery;

@Repository
public interface BatteryRepoInterface extends JpaRepository<Battery, Integer> {

}
