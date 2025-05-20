package com.ordermanagement.repository;

import com.ordermanagement.model.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    private List<Order> orders = new ArrayList<>();

    public OrderRepository() {
        orders.add(new Order(1, new String[]{"Item 1", "Item 2"}, true));
        orders.add(new Order(2, new String[]{"Item 3", "Item 4"}, false));
        orders.add(new Order(3, new String[]{"Item 5", "Item 6"}, true));
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public List<Order> getCancelledOrders() {
        return orders.stream().filter(order -> !order.getStatus()).collect(Collectors.toList());
    }
}
