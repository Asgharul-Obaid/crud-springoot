package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmpRepository;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private EmpRepository empRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

	@Override
	public Employee savEmployee(Employee employee) {
		return empRepository.save(employee);

	}

	@Override
	public Employee updatEmployee(Employee employee, int id) {
		Employee employee2 = empRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("update", "id", id));
		employee2.setName(employee.getName());
		empRepository.save(employee2);
		return employee2;
	}

	@Override
	public void deleteById(int id) {
		empRepository.deleteById(id);

	}

}
