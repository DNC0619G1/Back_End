package com.codegym.web_service.controller;

import com.codegym.dao.entity.OrderDetail;
import com.codegym.dao.repository.OrderRepository;
import com.codegym.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private OrderRepository orderRepository;
    @GetMapping(value = {"/orderdetails"})
    public ResponseEntity<List<OrderDetail>> getOrderDetails(){
        List<OrderDetail> orderDetails =orderDetailService.getOrderDetails();
        return ResponseEntity.ok(orderDetails);
    }
//    @PostMapping("/createorderdetail")
//    public ResponseEntity<OrderDetail> createRoom( @Valid @RequestBody OrderDetail orderDetail) {
//        orderDetail.getOrder().setIdOrder(orderRepository.maxIdOrder());
//        orderDetailService.createOrderDetail(orderDetail);
//        return ResponseEntity.ok(orderDetail);
//    }
}
