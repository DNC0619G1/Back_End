package com.codegym.web_service.controller;

import com.codegym.dao.entity.Chair;
import com.codegym.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChairController {
    @Autowired
    public ChairService chairService;
    @GetMapping(value = {"/getchairs"})
    private ResponseEntity<?> getChairs(){
        List<Chair> chairs =chairService.getChairs();
        return ResponseEntity.ok(chairs);
    }
    @GetMapping(value = {"/getchair/{id}"})
    public ResponseEntity<Chair> getChair(@PathVariable int id) {
        Chair chair = chairService.getChairById(id);
        return new ResponseEntity<Chair>(chair, HttpStatus.OK);
    }
    @GetMapping(value = {"/getmapchairs"})
    private ResponseEntity<?> getMapChairs(){
        Map<Integer,List<Chair>> mapChairs =chairService.getChairsMap();
        return ResponseEntity.ok(mapChairs);
    }

    @PostMapping("/addchair")
    public ResponseEntity<Chair> createRoom(@Valid @RequestBody Chair chair) {
        chairService.saveChair(chair);
        return ResponseEntity.ok(chair);
    }
    @DeleteMapping(value={"/deletechair/{idChair}"})
    public ResponseEntity<?> deletePromotion(@PathVariable("idChair") int idChair){
        chairService.deleteChair(idChair);
        return ResponseEntity.ok("delete ok");
    }

}
