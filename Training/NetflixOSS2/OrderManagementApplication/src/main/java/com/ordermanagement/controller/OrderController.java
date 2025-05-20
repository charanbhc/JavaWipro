package com.ordermanagement.controller;

import com.ordermanagement.model.Order;
import com.ordermanagement.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @GetMapping("/cancelled")
    public List<Order> getCancelledOrders() {
        return orderRepository.getCancelledOrders();
    }
}
