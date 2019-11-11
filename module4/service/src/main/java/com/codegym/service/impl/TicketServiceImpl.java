package com.codegym.service.impl;

import com.codegym.dao.entity.Ticket;
import com.codegym.dao.entity.User;
import com.codegym.dao.repository.TicketRepository;
import com.codegym.dao.repository.UserRepository;
import com.codegym.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAll() {
        return  ticketRepository.findAll();
    }

    @Override
    public List<Ticket> findByUser(Long idUser) {
        User user = userRepository.findByIdUser(idUser);
        return ticketRepository.findByUser(user);
    }
    @Override
    public List<Ticket> findByUserAndStatusIs(Long idUser,String status) {
        User user = userRepository.findByIdUser(idUser);
        return ticketRepository.findByUserAndStatusIs(user,"Da Huy Ve");
    }

    @Override
    public List<Ticket> findByUserAndStatusIsNot(Long idUser, String status) {
        User user = userRepository.findByIdUser(idUser);
        return ticketRepository.findByUserAndStatusIsNot(user,"Da Huy Ve");
    }

    @Override
    public List<Ticket> findByUserAndDateOrderTicketIsBetween(Long idUser, Date starDate, Date endDate) {
        User user = userRepository.findByIdUser(idUser);
        return  ticketRepository.findByUserAndDateOrderTicketIsBetween(user,starDate,endDate);
    }

}
