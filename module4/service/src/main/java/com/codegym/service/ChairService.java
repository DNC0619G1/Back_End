package com.codegym.service;

        import com.codegym.dao.entity.Chair;
        import java.util.List;

public interface ChairService {
    List<Chair> getChairs();
    Chair getChairById(int id);
    void saveChair(Chair chair);
    Chair deleteChair(int id);
    List<Chair> getChairByBookings(int id);
    List<Chair> getChairByIdRoom(int id);
}