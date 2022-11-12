package com.te.springrestcrud.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class StudentDTO {

	@Id
	private String rollno;
	private String name;
	private String age;
	private String gender;

}
