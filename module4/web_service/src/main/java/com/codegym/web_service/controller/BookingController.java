package com.codegym.web_service.controller;

import com.codegym.dao.entity.Booking;
import com.codegym.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping(value = {"/bookings"})
    private ResponseEntity<?> bookings(){
        List<Booking> bookings =bookingService.getBookings();
        return ResponseEntity.ok(bookings);
    }
    @PostMapping("/createbooking")
    public ResponseEntity<Booking> createRoom( Booking booking) {
        bookingService.saveBooking(booking);
        return ResponseEntity.ok(booking);
    }
}
