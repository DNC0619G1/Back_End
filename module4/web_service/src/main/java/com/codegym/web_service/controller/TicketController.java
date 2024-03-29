package com.codegym.web_service.controller;

import com.codegym.dao.entity.Ticket;
import com.codegym.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("")

public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticketUser")
    public List<Ticket> getAllTicket() {
        List<Ticket> tickets;
        tickets = ticketService.findAll();
        return tickets;
    }

    @GetMapping("/ticketUser/{idUser}")
    public ResponseEntity<List<Ticket>> getTicketByIdUser(@PathVariable(value = "idUser") Long idUser) {
        List<Ticket> ticket = ticketService.findByUser(idUser);
        return ResponseEntity.ok().body(ticket);
    }

    @GetMapping("/ticketUser/cancel/{idUser}")
    public ResponseEntity<List<Ticket>> getTicketByIdUserAndStatusIs(@PathVariable(value = "idUser") Long idUser) {
        String status = "da huy ve";
        List<Ticket> ticket = ticketService.findByUserAndStatusIs(idUser, status);
        return ResponseEntity.ok().body(ticket);
    }

    @GetMapping("/ticketUser/order/{idUser}")
    public ResponseEntity<List<Ticket>> getTicketByIdUserAndStatusIsNot(@PathVariable(value = "idUser") Long idUser) {
        String status = "da huy ve";
        List<Ticket> ticket = ticketService.findByUserAndStatusIsNot(idUser, status);
        return ResponseEntity.ok().body(ticket);
    }

    @GetMapping("ticketUser/pointHistory/{idUser}/{startDate}/{endDate}")
    public ResponseEntity<List<Ticket>> getHitoryPoint(@PathVariable(value = "idUser") Long idUser,
                                                       @PathVariable(value = "startDate") String startDate,
                                                       @PathVariable(value = "endDate") String endDate) {
        Date startDate1 = Date.valueOf(startDate);
        Date endDate1 = Date.valueOf(endDate);
        List<Ticket> ticket = ticketService.findByUserAndDateOrderTicketIsBetween(idUser, startDate1, endDate1);
        return ResponseEntity.ok().body(ticket);
    }


}
