package com.techlabs.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentRepositoryImplementation implements StudentRepository {
	@Autowired
	private EntityManager manager;
	
	@Override
	public List<Student> getAllStudents() {
	
		TypedQuery<Student> query=manager.createQuery("select s from Student s",Student.class);
		return null;
	}


	@Override
	public void getStudent(int rollnumber) {
	manager.find(Student.class, rollnumber);
		// TODO Auto-generated method stub		
	}


	@Override
	public void addStudent(Student student) {		
		manager.persist(student);
		
		
	}
	
	

}
