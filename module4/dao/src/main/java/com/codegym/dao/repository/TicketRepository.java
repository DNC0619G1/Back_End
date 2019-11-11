package com.codegym.dao.repository;

import com.codegym.dao.entity.Ticket;
import com.codegym.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Long> {

    List<Ticket> findByUser(User user);

    List<Ticket> findByUserAndStatusIs(User user,String status);

    List<Ticket> findByUserAndStatusIsNot(User user,String status);

    List<Ticket> findByUserAndDateOrderTicketIsBetween(User user, Date starDate, Date endDate);



}
