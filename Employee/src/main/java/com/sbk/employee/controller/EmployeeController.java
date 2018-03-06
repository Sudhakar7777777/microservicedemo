package com.sbk.employee.controller;

import com.sbk.employee.model.Employee;
import com.sbk.employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @Autowired
    EmployeeRepository employeeRepository;

    //Optional Argument: produces = "application/json" is set by default
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Employee create(@RequestBody Employee employee){

        Employee result = employeeRepository.save(employee);
        System.out.println("Output is " + result.toString());
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
    public Employee get(@PathVariable String employeeId){
        return employeeRepository.findOne(employeeId);
    }

    @RequestMapping(method = RequestMethod.GET, value="")
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
}
