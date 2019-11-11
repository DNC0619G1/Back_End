package com.codegym.service.impl;

import com.codegym.dao.entity.PriceTicket;
import com.codegym.dao.repository.PriceTicketRepository;
import com.codegym.service.PriceTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceTicketServiceImpl implements PriceTicketService {
    @Autowired
    private PriceTicketRepository priceTicketRepository;

    @Override
    public List<PriceTicket> getPriceTickets() {
        return priceTicketRepository.findAll();
    }
}
