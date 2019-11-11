package com.codegym.web_service.controller;

import com.codegym.dao.entity.Chair;
import com.codegym.dao.repository.ShowTimeRepository;
import com.codegym.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChairController {
    @Autowired
    public ChairService chairService;
    @Autowired
    public ShowTimeRepository showTimeRepository;
    @GetMapping(value = {"/getchairs"})
    public ResponseEntity<List<Chair>> getChairs(){
        List<Chair> chairs =chairService.getChairs();
        return ResponseEntity.ok(chairs);
    }
    @GetMapping(value = {"/getchair/{id}"})
    public ResponseEntity<Chair> getChair(@PathVariable int id) {
        Chair chair = chairService.getChairById(id);
        return new ResponseEntity<>(chair, HttpStatus.OK);
    }

    @PostMapping("/addchair")
    public ResponseEntity<Chair> createRoom(@Valid @RequestBody Chair chair) {
        chairService.saveChair(chair);
        return ResponseEntity.ok(chair);
    }
    @DeleteMapping(value={"/deletechair/{idChair}"})
    public ResponseEntity<Chair> deletePromotion(@PathVariable("idChair") int idChair){
        Chair chair =chairService.getChairById(idChair);
        chairService.deleteChair(idChair);
        return ResponseEntity.ok(chair);
    }
    @GetMapping(value = {"/getchairlist/{id}"})
    public ResponseEntity<List<Chair>> getChairsByIdBooking(@PathVariable int id){
        List<Chair> chairLists =chairService.getChairByBookings(id);
        return ResponseEntity.ok(chairLists);
    }

    @GetMapping(value = {"/chairlist/{id}"})
    public ResponseEntity<List<Chair>> getChairsByIdRoom(@PathVariable int id){
        List<Chair> getchairLists =chairService.getChairByIdRoom(id);
        return ResponseEntity.ok(getchairLists);
    }
}
