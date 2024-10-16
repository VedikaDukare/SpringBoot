package com.techlabs.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techlabs.demo.Repository.EmployeeRepository;
import com.techlabs.demo.entity.Employee;

public class EmployeeServiceImplementation implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
