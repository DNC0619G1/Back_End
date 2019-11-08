package com.codegym.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private int idOrder;

    @ManyToOne
    @JoinColumn(name ="id_show_time")
    private ShowTime showTime;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "date_order_ticket")
    private Date dateOrderTicket;

    @Column(name = "status")
    private String  status;

    public Order(){

    }

    public Order(ShowTime showTime, User user, Date dateOrderTicket, String status) {
        this.showTime = showTime;
        this.user = user;
        this.dateOrderTicket = dateOrderTicket;
        this.status = status;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateOrderTicket() {
        return dateOrderTicket;
    }

    public void setDateOrderTicket(Date dateOrderTicket) {
        this.dateOrderTicket = dateOrderTicket;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
