package com.sbk.employee.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sbk.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>
{

}
