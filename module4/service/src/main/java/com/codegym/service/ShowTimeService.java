package com.codegym.service;
import com.codegym.dao.entity.Movie;
import com.codegym.dao.entity.ShowTime;


import java.util.List;
import java.util.Map;

public interface ShowTimeService {
    List<ShowTime> getShowTimes();
    ShowTime getById(int id);
    Map<String, List <ShowTime>> mapShowTimes ();
}
