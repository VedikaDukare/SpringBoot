package com.techlabs.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.demo.entity.Student;
import com.techlabs.demo.repository.StudentRepository;


@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	private StudentRepository studentRepo;
	

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void getStudent(int rollnumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStudent(Student student) {
		studentRepo.addStudent(student);		
	}

}
