package com.codegym.service;

import com.codegym.dao.entity.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RoomService {
    List<Room> getRooms();
    Room getRoomById(int id);
    void saveRoom(Room room);
    Page<Room> pageRoom (Pageable pageable);

}
