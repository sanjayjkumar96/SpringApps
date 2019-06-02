package com.syfapp.syfrmapp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syfapp.syfrmapp.beans.Employee;
import com.syfapp.syfrmapp.exception.EmployeeNotFoundException;
import com.syfapp.syfrmapp.repo.EmployeeRepo;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public Iterable<Employee> getAllEmployee() {
		
		return empRepo.findAll();
	}

	@Override
	public Employee getEmployee(long empId) {
		
		return empRepo.findById(empId).orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with ID :"+ empId));
	}

	@Override
	public Employee saveEmployee(Employee newEmployee) {
		
		return empRepo.save(newEmployee);
	}

	@Override
	public void deleteEmployee(Employee delEmployee) {
		
	 empRepo.delete(delEmployee);
	}

	

	
}
