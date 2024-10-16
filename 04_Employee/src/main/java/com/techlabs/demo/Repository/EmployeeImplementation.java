package com.techlabs.demo.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techlabs.demo.entity.Employee;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class EmployeeImplementation implements EmployeeRepository {
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		TypedQuery<Employee> query=manager.createQuery("select s from Employe e s",Employee.class);
		return null;
		
	}

}
