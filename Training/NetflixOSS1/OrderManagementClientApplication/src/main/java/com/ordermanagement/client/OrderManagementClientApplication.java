package com.ordermanagement.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderManagementClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderManagementClientApplication.class, args);
    }
}
