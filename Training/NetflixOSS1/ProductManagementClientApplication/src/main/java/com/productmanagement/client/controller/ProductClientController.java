package com.productmanagement.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.productmanagement.client.model.Order;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/client/products")
public class ProductClientController 
{
    @Autowired
    private RestTemplate restTemplate;

    private final String SERVER_URL = "http://localhost:8080/order-management/orders";

    @GetMapping("/all")
    public List<Order> getAllOrders() 
    {
        ResponseEntity<Order[]> response = restTemplate.getForEntity(SERVER_URL + "/all", Order[].class);
        return Arrays.asList(response.getBody());
    }

    @GetMapping("/cancelled")
    public List<Order> getCancelledOrders() 
    {
        ResponseEntity<Order[]> response = restTemplate.getForEntity(SERVER_URL + "/cancelled", Order[].class);
        return Arrays.asList(response.getBody());
    }
}
