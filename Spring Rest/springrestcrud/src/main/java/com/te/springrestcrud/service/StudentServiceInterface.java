package com.te.springrestcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.te.springrestcrud.dto.StudentDTO;


public interface StudentServiceInterface {

	StudentDTO insert(StudentDTO dto);

	StudentDTO search(String rollno);

	StudentDTO update(String name, String rollno);

	boolean delete(String rollno);

	List<StudentDTO> getAllStudents();

}
