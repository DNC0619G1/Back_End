package com.codegym.dao.repository;

import com.codegym.dao.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RoomRepository extends PagingAndSortingRepository<Room,Integer> {
    List<Room> findAllByNameRoomContaining(String searchName);

}
