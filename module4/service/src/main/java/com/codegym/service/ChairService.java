package com.codegym.service;


import com.codegym.dao.entity.Chair;

import java.util.List;
import java.util.Map;


public interface ChairService {
    List<Chair> getChairs();
    Chair getChairById(int id);
    void saveChair(Chair chair);
    void updateChair(Chair chair);
    void deleteChair(int id);
    Map<Integer, List<Chair>> getChairsMap();
}