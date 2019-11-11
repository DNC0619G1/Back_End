package com.codegym.service;
import com.codegym.dao.entity.Order;


import java.util.List;

public interface OrderService {
    List<Order> getOrders();
    void saveOrder(Order order);
}
