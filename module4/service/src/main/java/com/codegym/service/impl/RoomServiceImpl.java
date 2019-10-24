package com.codegym.service.impl;

import com.codegym.dao.entity.Room;
import com.codegym.dao.repository.RoomRepository;
import com.codegym.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;
    @Override
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room getRoomById(int id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public void saveRoom(Room room) {
        Room roomCreate = new Room();
        roomCreate.setIdRoom(room.getIdRoom());
        roomCreate.setNameRoom(room.getNameRoom());
        roomRepository.save(roomCreate);
    }

//    @Override
//    public void updateNameRoom(int id, String name) {
//        Room room=roomRepository.findById(id).orElse(null);
//        room.setNameRoom(name);
//        roomRepository.save(room);
//    }
}
