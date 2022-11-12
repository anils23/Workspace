package com.te.springrestcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrestcrud.dto.StudentDTO;
import com.te.springrestcrud.repository.StudentRepositoryInterface;

@Service
public class StudentServiceClass implements StudentServiceInterface{
	
	@Autowired
	StudentRepositoryInterface repositoryInterface; 
	

	@Override
	public StudentDTO insert(StudentDTO dto) {
		repositoryInterface.insert(dto);
		return repositoryInterface.insert(dto);
	}

	@Override
	public StudentDTO search(String rollno) {
		return repositoryInterface.search(rollno);
	}

	@Override
	public StudentDTO update(String name, String rollno) {
		StudentDTO update = repositoryInterface.update(name, rollno);
		return update;
	}

	@Override
	public boolean delete(String rollno) {
		boolean delete = repositoryInterface.delete(rollno);
		return delete;
	}

	@Override
	public List<StudentDTO> getAllStudents() {
        List<StudentDTO> allStudents = repositoryInterface.getAllStudents();
        return allStudents;
	}

}
