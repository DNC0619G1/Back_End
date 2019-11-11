package com.codegym.service;

import com.codegym.dao.dto.UserDTO;
import com.codegym.dao.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    UserDTO findByIdUser(Long idUser);

    void updatePassword(UserDTO userDTO);

    void updateUser(UserDTO userDTO);

    void save(UserDTO userDTO);

    User saveUser(User user);

    List<User> searchUser(String keyword);
}
