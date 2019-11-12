package com.codegym.service;
import com.codegym.dao.entity.Booking;
import java.util.List;

public interface BookingService {
    List<Booking> getBookings();
    void saveBooking(Booking booking);
    Booking getBookingById(int id);
}
