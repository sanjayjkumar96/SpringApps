package com.syfapp.syfrmapp.service;

import com.syfapp.syfrmapp.beans.Employee;

public interface EmployeeService {

	public Iterable<Employee> getAllEmployee();
	
	public Employee getEmployee(long id);
	
	public Employee saveEmployee(Employee newEmployee);
	
	public void deleteEmployee(Employee delEmployee);
	
}
