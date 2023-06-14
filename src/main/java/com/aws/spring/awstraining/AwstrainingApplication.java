package com.aws.spring.awstraining;

import com.aws.spring.awstraining.entity.Employee;
import com.aws.spring.awstraining.entity.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EntityScan
public class AwstrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwstrainingApplication.class, args).getBean(AwstrainingApplication.class);
	}
}
