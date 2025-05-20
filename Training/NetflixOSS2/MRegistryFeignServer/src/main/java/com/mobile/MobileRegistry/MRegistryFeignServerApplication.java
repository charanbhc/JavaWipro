package com.mobile.MobileRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.mobile.controller", "com.mobile.dao", "com.mobile.Model"})
@SpringBootApplication
public class MRegistryFeignServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MRegistryFeignServerApplication.class, args);
	}

}
