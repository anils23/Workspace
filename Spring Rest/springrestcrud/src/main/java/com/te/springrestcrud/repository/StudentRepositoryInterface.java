package com.te.springrestcrud.repository;

import java.util.List;

import org.springframework.stereotype.Repository; 
import org.springframework.web.bind.annotation.RestController;

import com.te.springrestcrud.dto.StudentDTO;


public interface StudentRepositoryInterface {

	StudentDTO insert(StudentDTO dto);

	StudentDTO search(String rollno);

	StudentDTO update(String name, String rollno);

	boolean delete(String rollno);

	List<StudentDTO> getAllStudents();

}
