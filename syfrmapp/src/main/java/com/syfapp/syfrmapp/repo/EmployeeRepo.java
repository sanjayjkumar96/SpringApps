package com.syfapp.syfrmapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.syfapp.syfrmapp.beans.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
