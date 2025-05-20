package com.VerifyMobileUsingRestTemplate.MobileVerificationUsingRestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
@ComponentScan({"com.VerifyMobileUsingRestTemplate.controller", "VerifyMobileUsingRestTemplate.Model"})
@SpringBootApplication
public class MobileVerificationUsingRestTemplateApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MobileVerificationUsingRestTemplateApplication.class, args);
	}
	
	@Bean
	public  RestTemplate  resttemp()
	{
		System.out.println("RestTemplate created....");
		return  new RestTemplate();
	}
}
