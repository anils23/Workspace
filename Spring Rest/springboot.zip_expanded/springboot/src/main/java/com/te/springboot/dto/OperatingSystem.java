package com.te.springboot.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class OperatingSystem {
	
	@Id
	private Integer num;
	private String os;
	private String owner;

}
