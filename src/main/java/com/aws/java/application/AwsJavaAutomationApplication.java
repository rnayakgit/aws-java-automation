package com.aws.java.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.aws.automate.controller")
public class AwsJavaAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsJavaAutomationApplication.class, args);
	}

}
