package com.codegym.web_service.controller;

import com.codegym.dao.entity.Room;
import com.codegym.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RoomController {
    @Autowired
    public RoomService roomService;

    @GetMapping(value = {"/rooms"})
    public ResponseEntity<List<Room>> getRooms() {
        List<Room> chairs = roomService.getRooms();
        return ResponseEntity.ok(chairs);
    }

    @GetMapping(value = {"/room/{id}"})
    public ResponseEntity<Room> getRoom(@PathVariable int id) {
        Room room = roomService.getRoomById(id);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    @PostMapping("/addroom")
    public ResponseEntity<Room> createRoom(@Valid @RequestBody Room room) {
        roomService.saveRoom(room);
        return ResponseEntity.ok(room);
    }


    @GetMapping(value = {"/roomPages"})
    public ResponseEntity<Page<Room>> getRooms(@PageableDefault(value = 5) Pageable pageable ) {
        Page<Room> chairs = roomService.pageRoom(pageable);
        return ResponseEntity.ok(chairs);
    }
    @GetMapping(value = {"/searchNameRoom/{nameRoom}"})
    public ResponseEntity<List<Room>> getSearchNameRoom(@PathVariable String nameRoom) {
        List<Room> chairSearchs = roomService.getSearchRoom(nameRoom);
        return ResponseEntity.ok(chairSearchs);
    }
}
