package com.codegym.dao.repository;

import com.codegym.dao.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Integer> {
    List<Room> findAllByNameRoomContaining(String searchName);

}
