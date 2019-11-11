package com.codegym.service;

import com.codegym.dao.entity.BookingDetail;

import java.util.List;

public interface BookingDetailService {
    List<BookingDetail> getBookingDetails();
    BookingDetail createBookingDetail(BookingDetail bookingDetail);
}
