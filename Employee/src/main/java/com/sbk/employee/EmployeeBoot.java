package com.sbk.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class EmployeeBoot
{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeBoot.class, args);
	}

	@Autowired
	private Environment env;
}
