package com.wust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ContainerSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerSchedulingApplication.class, args);
	}

}

