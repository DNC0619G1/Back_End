package com.codegym.web_service.controller;
import com.codegym.dao.entity.Order;
import com.codegym.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("")
public class OrderController {
    @Autowired
    public OrderService orderService;
    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrder(){
        List<Order> orders ;
        orders = orderService.findAll();
        return ResponseEntity.ok(orders);
    }
    @PostMapping("/createOrders")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
        return ResponseEntity.ok(order);
    }
    @GetMapping(value = {"/getorder/{id}"})
    public ResponseEntity<Order> getOrder(@PathVariable int idOrder) {
        Order order = orderService.getOrderById(idOrder);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
