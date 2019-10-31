//package com.codegym.dao.entity;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "booking_detail")
//public class BookingDetail implements Serializable {
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "id_booking")
//    private Booking booking;
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "id_chair")
//    private Chair chair;
//
//    @Column(name="booking_line")
//    private int lineBooking;
//
//    public BookingDetail() {
//    }
//
//    public Booking getIdBooking() {
//        return booking;
//    }
//
//    public void setIdBooking(Booking booking) {
//        this.booking = booking;
//    }
//
//    public Chair getIdChair() {
//        return chair;
//    }
//
//    public void setIdChair(Chair chair) {
//        this.chair = chair;
//    }
//
//    public int getLineBooking() {
//        return lineBooking;
//    }
//
//    public void setLineBooking(int lineBooking) {
//        this.lineBooking = lineBooking;
//    }
//}
