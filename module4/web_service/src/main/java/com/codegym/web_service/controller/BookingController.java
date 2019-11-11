package com.codegym.web_service.controller;

import com.codegym.dao.entity.Booking;
import com.codegym.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping(value = {"/bookings"})
    public ResponseEntity<List<Booking>> bookings(){
        List<Booking> bookings =bookingService.getBookings();
        return ResponseEntity.ok(bookings);
    }
    @PostMapping("/createbooking")
    public ResponseEntity<Booking> createRoom(@Valid @RequestBody Booking booking) {
        bookingService.saveBooking(booking);
        return ResponseEntity.ok(booking);
    }
    @GetMapping(value = {"/getbooking/{id}"})
    public ResponseEntity<Booking> getBooking(@PathVariable int id) {
        Booking booking = bookingService.getBookingById(id);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

}
