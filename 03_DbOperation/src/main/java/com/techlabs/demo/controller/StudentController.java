package com.techlabs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.demo.entity.Student;
import com.techlabs.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public  ResponseEntity<List<Student>> getAllStudents(){
		
		return ResponseEntity.ok(studentService.getAllStudents());
		
	}
	
	public  ResponseEntity<List<Student>> getStudent(@PathVariable int rollnumber){
		return ResponseEntity.ok(studentService.getStudent(rollnumber));
	}
	
	

}
