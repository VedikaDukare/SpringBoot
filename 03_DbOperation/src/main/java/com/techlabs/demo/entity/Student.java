package com.techlabs.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	
	public Student() {
		
	}
	
	@Column
	@Id
	private int rollnumber;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	
	public Student(int rollnumber, String name, int age) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
	}

}
