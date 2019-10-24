package com.codegym.web_service.controller;

import com.codegym.dao.entity.Room;
import com.codegym.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RoomController {
    @Autowired
    public RoomService roomService;
    @GetMapping(value = {"/rooms"})
    private ResponseEntity<?> getRooms(){
        List<Room> chairs =roomService.getRooms();
        return ResponseEntity.ok(chairs);
    }
}
