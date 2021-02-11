package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employees;

public interface EmployeeService {
	public List<Employees> findAll();
	public Employees save(Employees employee);
	
	

}
