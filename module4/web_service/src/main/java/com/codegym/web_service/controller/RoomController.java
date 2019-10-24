package com.codegym.web_service.controller;

import com.codegym.dao.entity.Room;
import com.codegym.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private ResponseEntity<?> getRooms(){
        List<Room> chairs =roomService.getRooms();
        return ResponseEntity.ok(chairs);
    }
    @GetMapping(value = {"/room/{id}"})
    public ResponseEntity<Room> getRoom(@PathVariable int id) {
        Room room = roomService.getRoomById(id);
        return new ResponseEntity<Room>(room, HttpStatus.OK);
    }
    @PostMapping("/rooms")
    public ResponseEntity<Room> createRoom(@Valid @RequestBody Room room){
        roomService.saveRoom(room);
        return ResponseEntity.ok(room);
    }
//    @PutMapping("/rooms/{id}")
//    public ResponseEntity<Room> updateRoom(@PathVariable(value = "id") Integer idRoom,
//                                                   @Valid @RequestBody Room roomDetails) {
//        Room room = roomService.getRoomById(idRoom);
//        room.setNameRoom(roomDetails.getNameRoom());
//        final Room updatedEmployee = roomService.saveRoom(room);
//        return ResponseEntity.ok(room);
//    }

}
