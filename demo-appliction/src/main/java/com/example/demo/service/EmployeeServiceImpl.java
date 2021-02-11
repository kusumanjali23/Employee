package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employees;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public Employees save(Employees employee) {
		return employeeRepo.save(employee);
	}

	public List<Employees> findAll() {
		return employeeRepo.findAll();
	}

}
