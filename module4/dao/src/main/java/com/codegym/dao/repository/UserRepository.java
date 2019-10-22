package com.codegym.dao.repository;

import com.codegym.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByIdUser(Long idUser);
}
