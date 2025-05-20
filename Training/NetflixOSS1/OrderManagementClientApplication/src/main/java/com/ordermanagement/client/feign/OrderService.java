package com.ordermanagement.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.ordermanagement.client.model.Order;

@FeignClient(name="order-management", url="http://localhost:8080/order-management")
public interface OrderService {
    @GetMapping("/orders/all")
    ResponseEntity<List<Order>> getAllOrders();

    @GetMapping("/orders/cancelled")
    ResponseEntity<List<Order>> getCancelledOrders();
}
