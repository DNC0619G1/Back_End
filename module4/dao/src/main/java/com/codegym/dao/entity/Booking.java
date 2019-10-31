package com.codegym.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Booking")
    private int idBooking;

    @ManyToOne
    @JoinColumn(name ="id_show")
    private ShowTime showTime;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

    @Temporal(TemporalType.DATE)
    @Column(name = "booking_date")
    private Date bookingDate;

    public Booking() {
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
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

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
