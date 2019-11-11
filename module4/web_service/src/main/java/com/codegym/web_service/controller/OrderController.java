package com.codegym.web_service.controller;
import com.codegym.dao.entity.Order;
import com.codegym.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrder() {
        List<Order> orders;
        orders = orderService.getOrders();
        return orders;
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
        return ResponseEntity.ok(order);
    }
}
