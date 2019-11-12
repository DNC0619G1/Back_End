package com.codegym.service;

import com.codegym.dao.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> getOrderDetails();
    OrderDetail createOrderDetail(OrderDetail orderDetail);
}
