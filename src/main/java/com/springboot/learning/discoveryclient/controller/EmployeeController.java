package com.springboot.learning.discoveryclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learning.discoveryclient.model.Employee;
import com.springboot.learning.discoveryclient.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/getEmployees")
	public ResponseEntity<List<Employee>> getEmployeeDetails(){
		
		
		return new ResponseEntity<List<Employee>>(empService.getEmployees(),HttpStatus.OK);
	}
	
	
}
