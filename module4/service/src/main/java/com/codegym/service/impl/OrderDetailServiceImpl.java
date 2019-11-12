package com.codegym.service.impl;

import com.codegym.dao.entity.OrderDetail;
import com.codegym.dao.repository.OrderDetailRepository;
import com.codegym.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Override
    public List<OrderDetail> getOrderDetails() {
        return orderDetailRepository.findAll();
    }

    @Override
    public OrderDetail createOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }
}
