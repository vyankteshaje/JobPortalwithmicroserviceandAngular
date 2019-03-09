package com.jobportal.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
@EnableZuulProxy
public class JobPortalZuulApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(JobPortalZuulApplication.class, args);
	}

}
