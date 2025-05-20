package com.VerifyMobileUsingFeignClient.MobileVerificationUsingFeignClient;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
//@ComponentScan
//({"com.VerifyMobileUsingFeignClient.Model",
//	"com.VerifyMobileUsingFeignClient.client",
//	"com.VerifyMobileUsingFeignClient.controller"})
 
@SpringBootApplication
@EnableFeignClients
public class MobileVerificationUsingFeignClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(MobileVerificationUsingFeignClientApplication.class, args);
	}
 
}