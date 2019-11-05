package com.codegym.service.impl;
import com.codegym.dao.entity.Movie;
import com.codegym.dao.entity.ShowTime;
import com.codegym.dao.repository.ShowTimeRepository;
import com.codegym.service.ShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ShowTimeServiceImpl implements ShowTimeService {
    @Autowired
    private ShowTimeRepository showTimeRepository;

    @Override
    public List<ShowTime> getShowTimes() {
        return showTimeRepository.findAll();
    }
    @Override
    public ShowTime getById(int id) {
        return showTimeRepository.findById(id).orElse(null);
    }

    @Override
    public Map<String, List <ShowTime>> mapShowTimes() {
        Map<String, List <ShowTime>> mapShowTimes=new HashMap<String, List <ShowTime>>();
        List<ShowTime> showTimes =showTimeRepository.findAll();
         mapShowTimes = showTimes.stream().collect(Collectors.groupingBy(showTime->showTime.getMovie().getNameMovie()));
        return mapShowTimes;
    }
}