package com.codegym.web_service.controller;

import com.codegym.dao.entity.ShowTime;
import com.codegym.service.ShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ShowTimeController {
    @Autowired
    public ShowTimeService showTimeService;

    @GetMapping(value = "/getShowTimes")
    public ResponseEntity<List<ShowTime>> getShowTimes() {
        List<ShowTime> showTimes = showTimeService.getShowTimes();
        return ResponseEntity.ok(showTimes);
    }

    @GetMapping(value = {"/getShowtime/{id}"})
    public ResponseEntity<ShowTime> getShowTime(@PathVariable int id) {
        ShowTime showTime = showTimeService.getById(id);
        return new ResponseEntity<>(showTime, HttpStatus.OK);
    }
    @GetMapping(value = "/getmapshowtimes")
    public ResponseEntity< Map<String, List<ShowTime>>> getMapShowTimes() {
        Map<String, List<ShowTime>> mapShowTimes = showTimeService.mapShowTimes();
        return ResponseEntity.ok(mapShowTimes);
    }

}