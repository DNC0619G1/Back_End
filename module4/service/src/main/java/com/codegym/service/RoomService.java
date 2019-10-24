package com.codegym.service;

import com.codegym.dao.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> getRooms();
    Room getRoomById(int id);
    void saveRoom(Room room);
}
