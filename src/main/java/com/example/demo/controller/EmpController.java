package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ServiceInterface;

@RestController
@RequestMapping("/api/v1")
public class EmpController {

	@Autowired
	private ServiceInterface serviceInterface;		

	@GetMapping("/")
	List<Employee> getAllEmployees() {
		return serviceInterface.getAllEmployee();
	}

	@PostMapping("/save")
	ResponseEntity<Employee> saveDetails(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(serviceInterface.savEmployee(employee), HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	ResponseEntity<String> updateUser(@RequestBody Employee employee, @PathVariable("id") int id) {
		serviceInterface.updatEmployee(employee, id);
		return new ResponseEntity<String>(id + " - updated", HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
		serviceInterface.deleteById(id);
		return new ResponseEntity<String>(id + " - Deleted", HttpStatus.OK);
	}
}
