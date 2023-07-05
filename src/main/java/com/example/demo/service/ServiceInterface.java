package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
@Service
public interface ServiceInterface {

	
	
	List<Employee> getAllEmployee();

	Employee savEmployee(Employee employee);

	Employee updatEmployee(Employee employee, int id);

	public void deleteById(int id);

}
