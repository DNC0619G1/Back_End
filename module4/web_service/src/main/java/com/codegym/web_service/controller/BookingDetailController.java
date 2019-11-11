package com.codegym.web_service.controller;

import com.codegym.dao.entity.BookingDetail;
import com.codegym.dao.repository.BookingRepository;
import com.codegym.service.BookingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookingDetailController {
    @Autowired
    private BookingDetailService bookingDetailService;
    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping(value = {"/bookingdetails"})
    public ResponseEntity<List<BookingDetail>> getBookingDetails(){
        List<BookingDetail> bookingdetails =bookingDetailService.getBookingDetails();
        return ResponseEntity.ok(bookingdetails);
    }
    @PostMapping("/createbookingdetail")
    public ResponseEntity<BookingDetail> createRoom( @Valid  @RequestBody BookingDetail bookingDetail) {
        bookingDetail.getBooking().setIdBooking(bookingRepository.maxIdBooking());
        bookingDetailService.createBookingDetail(bookingDetail);
        return ResponseEntity.ok(bookingDetail);
    }
}
