package com.syfapp.syfrmapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syfapp.syfrmapp.beans.Employee;
import com.syfapp.syfrmapp.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/Employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl empService;
	
	@GetMapping("/employees")
	public Iterable<Employee> getAllEmployees() {
		return empService.getAllEmployee();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
		Employee employee = empService.getEmployee(employeeId);
				
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		return empService.saveEmployee(employee);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody Employee employeeDetails)	{
		Employee employee = empService.getEmployee(employeeId);
		
		employee.setEmpName(employeeDetails.getEmpName());
		employee.setEmpAddress(employeeDetails.getEmpAddress());
		employee.setEmpPhoneNo(employeeDetails.getEmpPhoneNo());
		
		final Employee updatedEmployee = empService.saveEmployee(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			 {
		Employee employee = empService.getEmployee(employeeId);

		empService.deleteEmployee(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
