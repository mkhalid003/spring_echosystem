package com.demo.demostudentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStudentServiceApplication.class, args);
	}

}
