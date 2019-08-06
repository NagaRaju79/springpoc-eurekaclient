package com.springboot.learning.discoveryclient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.learning.discoveryclient.model.Employee;

@Service
public class EmployeeService {

	
	public List<Employee> getEmployees(){
		
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee(1l, "NagaRaju", "9391907756");
		empList.add(emp1);
		return empList; 
		
	}
	
}
