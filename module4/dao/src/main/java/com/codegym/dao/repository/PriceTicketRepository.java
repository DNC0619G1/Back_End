package com.codegym.dao.repository;

import com.codegym.dao.entity.PriceTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceTicketRepository extends JpaRepository<PriceTicket,Integer> {
}
