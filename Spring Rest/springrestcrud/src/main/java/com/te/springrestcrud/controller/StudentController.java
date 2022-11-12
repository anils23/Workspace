package com.te.springrestcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrestcrud.dto.StudentDTO;
import com.te.springrestcrud.service.StudentServiceInterface;

@RestController
public class StudentController {

	@Autowired
	StudentServiceInterface serviceInterface;

	@PostMapping(path = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public MyResponse insert(@RequestBody StudentDTO dto) {
		StudentDTO student = serviceInterface.insert(dto);
		MyResponse response = new MyResponse();
		if (student != null) {
			response.setMessage("Data Inserted Succesfully...!!!");
			return response;
		}
		response.setMessage("Invalid data? Please try again later...!!!");
		return response;
	}

	@GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public MyResponse search(@RequestParam String rollno) {
		StudentDTO student = serviceInterface.search(rollno);
		MyResponse response = new MyResponse();
		if (student != null) {
			response.setMessage("It's your Data...!!!");
			response.setInfo(student);
			return response;
		}
		response.setMessage("Student Not Found...!!!");
		return response;
	}

	@PostMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public MyResponse update(@RequestParam String name, @RequestParam String rollno) {
		StudentDTO student = serviceInterface.update(name, rollno);
		MyResponse response = new MyResponse();
		if (student != null) {
			response.setMessage("Data Updated...!!!");
			response.setInfo(student);
			return response;
		}
		response.setMessage("Student not found...!!!");
		return response;
	}

	@PostMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public MyResponse delete(@RequestParam String rollno) {
		boolean delete = serviceInterface.delete(rollno);
		MyResponse response = new MyResponse();
		if (delete) {
			response.setMessage("Student Deleted...!!!");
			return response;
		}
		response.setMessage("Student not found...!!!");
		return response;
	}

	@GetMapping(path = "/alldata", produces = MediaType.APPLICATION_JSON_VALUE)
	public MyResponse getAllStudents() {
		List<StudentDTO> allStudents = serviceInterface.getAllStudents();
		MyResponse response = new MyResponse();
		if (allStudents != null) {
			response.setListInfo(allStudents);
			return response;
		}
		response.setMessage("Your Database is Empty...!!!");
		return response;
	}

}
