package com.codegym.web_service.controller;


import com.codegym.dao.dto.UserDTO;
import com.codegym.dao.entity.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getAllUser() {
        List<User> users;

        users = userService.findAll();

        return users;
    }
    @PostMapping("/users")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
        return ResponseEntity.ok(userDTO);
    }
    @GetMapping("/users/showAndUpdate/{idUser}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable(value = "idUser") Long idUser) {
        UserDTO userDTO = userService.findByIdUser(idUser);
        return ResponseEntity.ok().body(userDTO);
    }
    @PutMapping("/users/update/{idUser}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable(value = "idUser") Long idUser
            ,@RequestBody UserDTO userDTO){
        userDTO.setIdUser(idUser);
        userService.updateUser(userDTO);
        return ResponseEntity.ok(userDTO);
    }
    @PutMapping("/users/updatePassword/{idUser}")
    public ResponseEntity<UserDTO> updatePassword(@PathVariable(value = "idUser") Long idUser
            ,@RequestBody UserDTO userDTO){
        userDTO.setIdUser(idUser);
        userService.updatePassword(userDTO);
        return ResponseEntity.ok(userDTO);
    }

    @PutMapping(value={"/users/add/{idUser}"})
    public ResponseEntity<User> addUser(@PathVariable(value = "idUser") Long idUser, @RequestBody User user){
        user.setIdUser(idUser);
        userService.saveUser(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping(value={"/users/search/{keyword}"})
    public  ResponseEntity<?> getSearch(@PathVariable("keyword") String keyword){
        List<User> users = userService.searchUser(keyword);
        return ResponseEntity.ok(users);
    }
}
