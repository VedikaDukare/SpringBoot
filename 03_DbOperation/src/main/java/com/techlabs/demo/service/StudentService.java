package com.techlabs.demo.service;

import java.util.List;

import com.techlabs.demo.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();

	void getStudent(int rollnumber);
	
	public void addStudent(Student student);
	
	
	

}
