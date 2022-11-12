package com.te.springboot.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.engine.jdbc.batch.spi.Batch;

import lombok.Data;

@Data
@Entity
public class Battery {
	
	@Id
	private Integer id;
	private String brand;
	private String time;
	
	@OneToMany
	private List<Batch> batch;
	
	

}
