package com.codegym.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderDetail_id")
    private int orderDetailId;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order orders;

    @ManyToOne
    @JoinColumn(name = "id_chair")
    private Chair chair;

    @JoinColumn(name = "price_chair")
    private int priceChair;

    public OrderDetail() {
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Order getOrder() {
        return orders;
    }

    public void setOrder(Order orders) {
        this.orders = orders;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public int getPriceChair() {
        return priceChair;
    }

    public void setPriceChair(int priceChair) {
        this.priceChair = priceChair;
    }
}

