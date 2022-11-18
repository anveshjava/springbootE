package com.sigma.employee.repo;

import com.sigma.employee.entity.EmployeeEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>  {

}
