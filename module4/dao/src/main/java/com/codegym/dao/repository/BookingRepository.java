package com.codegym.dao.repository;

import com.codegym.dao.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
    @Query(value = "SELECT max(idBooking) FROM Booking")
    public int maxIdBooking();
}
