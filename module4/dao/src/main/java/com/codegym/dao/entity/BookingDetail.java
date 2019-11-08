package com.codegym.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "booking_detail")
public class BookingDetail  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingdetail_id")
    private int idBookingDetail;

    @ManyToOne
    @JoinColumn(name = "id_booking")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "id_chair")
    private Chair chair;

    @JoinColumn(name = "price_chair")
    private int priceChair;

    public BookingDetail() {
    }

    public int getIsBookingDetail() {
        return idBookingDetail;
    }

    public void setIsBookingDetail(int isBookingDetail) {
        this.idBookingDetail = isBookingDetail;
    }

    public Booking getBooking() {
        return booking;
    }

    public int getIdBookingDetail() {
        return idBookingDetail;
    }

    public void setIdBookingDetail(int idBookingDetail) {
        this.idBookingDetail = idBookingDetail;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
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
