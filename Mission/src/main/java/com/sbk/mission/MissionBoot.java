package com.sbk.mission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MissionBoot
{

	public static void main(String[] args) {
		SpringApplication.run(MissionBoot.class, args);
	}

	@Autowired
	private Environment env;
}
