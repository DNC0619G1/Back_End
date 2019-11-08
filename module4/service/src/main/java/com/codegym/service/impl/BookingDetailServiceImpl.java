package com.codegym.service.impl;

import com.codegym.dao.entity.BookingDetail;
import com.codegym.dao.repository.BookingDetailRepository;
import com.codegym.service.BookingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class BookingDetailServiceImpl implements BookingDetailService {
    @Autowired
    private BookingDetailRepository bookingDetailRepository;
    @Override
    public List<BookingDetail> getBookingDetails() {
        return bookingDetailRepository.findAll();
    }

    @Override
    public BookingDetail createBookingDetail(BookingDetail bookingDetail) {
        return bookingDetailRepository.save(bookingDetail);
    }

}
