package com.codegym.service.impl;

import com.codegym.dao.entity.Room;
import com.codegym.dao.repository.RoomRepository;
import com.codegym.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;
    @Override
    public List<Room> getRooms() {
        return (List<Room>) roomRepository.findAll();
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
        roomCreate.setDescription(room.getDescription());
        roomRepository.save(roomCreate);
    }

    @Override
    public Page<Room> pageRoom(Pageable pageable) {
        return roomRepository.findAll( pageable);
    }


}
