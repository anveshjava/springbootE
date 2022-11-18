package com.sigma.employee.service;

import com.sigma.employee.entity.EmployeeEntity;
import com.sigma.employee.repo.EmployeeRepository;
import com.sigma.employee.response.EmployeeResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;
	
	@Autowired
	private ModelMapper modelMapper;

	public EmployeeResponse getEmployeeDetail(int id) {

		EmployeeEntity employee = employeerepository.findById(id).get();
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
		
		/*
		 * EmployeeResponse employeeResponse = new EmployeeResponse();
		 * employeeResponse.setId(employee.getId());
		 * employeeResponse.setName(employee.getName());
		 * employeeResponse.setEmail(employee.getEmail());
		 * employeeResponse.setBloodgroup(employee.getBloodgroup());
		 */
		return employeeResponse;

	}
}
