package com.codegym.service.impl;

import com.codegym.dao.entity.Booking;
import com.codegym.dao.repository.BookingRepository;
import com.codegym.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Override
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }
    @Override
    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public Booking getBookingById(int id) {
        return bookingRepository.findById(id).orElse(null);
    }
}
