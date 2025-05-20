package com.ordermanagement.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.ordermanagement.client.model.Order;
import com.ordermanagement.client.feign.OrderService;

@RestController
@RequestMapping("/client/orders")
public class OrderClientController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders().getBody();
    }

    @GetMapping("/cancelled")
    public List<Order> getCancelledOrders() {
        return orderService.getCancelledOrders().getBody();
    }
}
