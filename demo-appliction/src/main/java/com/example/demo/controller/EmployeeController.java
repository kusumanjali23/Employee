package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employees;
import com.example.demo.service.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/employee")
	public Employees saveEmployee(@RequestBody Employees employees) {
		System.out.println("Saving user.");
		return employeeService.save(employees);
	}

	@GetMapping(value = "/employee")
	public List<Employees> getAllEmployees() {
		System.out.println("Getting all users.");
		return employeeService.findAll();
	}

}
