package com.jobportal.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
@EnableJpaRepositories("com")
@EntityScan("com")
public class JobPortalClientApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(JobPortalClientApplication.class, args);
	}

}
