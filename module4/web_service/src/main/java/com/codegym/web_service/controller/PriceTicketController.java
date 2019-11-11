package com.codegym.web_service.controller;

import com.codegym.dao.entity.PriceTicket;
import com.codegym.service.PriceTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PriceTicketController {
    @Autowired
    private PriceTicketService priceTicketService;

    @GetMapping(value = {"/pricetickets"})
    public ResponseEntity<List<PriceTicket>> getPriceTickets(){
        List<PriceTicket> priceTickets =priceTicketService.getPriceTickets();
        return ResponseEntity.ok(priceTickets);
    }
}
