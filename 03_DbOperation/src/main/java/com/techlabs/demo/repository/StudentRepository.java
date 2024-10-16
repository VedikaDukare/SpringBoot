package com.techlabs.demo.repository;

import java.util.List;

import com.techlabs.demo.entity.Student;

public interface StudentRepository {
	
	List<Student> getAllStudents();
	
	public void getStudent(int rollnumber);
  
	public void addStudent(Student student);
}
