package com.Demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.Demo.demo.controller")
public class EmployeeSpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringRestApplication.class, args);

	}

}
