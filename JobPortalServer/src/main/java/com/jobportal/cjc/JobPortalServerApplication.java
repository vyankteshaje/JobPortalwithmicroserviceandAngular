package com.jobportal.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaServer
public class JobPortalServerApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(JobPortalServerApplication.class, args);
	}

}
