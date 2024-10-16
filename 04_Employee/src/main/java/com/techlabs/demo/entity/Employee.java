package com.techlabs.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Employee {
	
	public Employee() {
		
	}
		
	public Employee(int id, double salary, int age) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
	}

	@Column
	@Id
	private int id;
	
	@Column
	private double salary;
	
	@Column
	private int age;

}
