package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		return this.employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Long employeeId) {
		return this.employeeRepo.findById(employeeId);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return this.employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employeeDetails) {
		return this.employeeRepo.save(employeeDetails);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		this.employeeRepo.delete(employee);
	}

}
