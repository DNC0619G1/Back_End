package com.codegym.service;
import com.codegym.dao.entity.Order;
import java.util.List;

public interface OrderService {
    List<Order> findAll();
    void saveOrder(Order order);
    Order getOrderById(int id);
}
