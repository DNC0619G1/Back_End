package com.codegym.service;

import com.codegym.dao.entity.Ticket;

import java.util.Date;
import java.util.List;

public interface TicketService {

    List<Ticket> findAll();

    List<Ticket> findByUser (Long idUser);

    List<Ticket> findByUserAndStatusIs (Long idUser, String status);

    List<Ticket> findByUserAndStatusIsNot(Long idUser,String status);

    List<Ticket> findByUserAndDateOrderTicketIsBetween(Long idUser, Date starDate, Date endDate);


}
