package com.company.businesslayer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.businesslayer.IEmployeeService;
import com.company.datalayer.IEmployeeRepository;
import com.company.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepository repository;
	
	@Override
	public Employee findEmployeeById(int id) {
		return repository.findById(id).get();
	}

}
