package com.sigma.employee.controller;

import com.sigma.employee.entity.EmployeeEntity;
import com.sigma.employee.response.EmployeeResponse;
//import com.sigma.employee.repo.EmployeeRepository;
import com.sigma.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/employees/{id}")
	ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
		// db call --> employee 1
		EmployeeResponse employee = employeeservice.getEmployeeDetail(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employee);
	}
}
