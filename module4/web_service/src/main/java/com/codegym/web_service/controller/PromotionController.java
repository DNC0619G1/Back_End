package com.codegym.web_service.controller;
import com.codegym.dao.entity.Movie;
import com.codegym.dao.entity.Promotion;
import com.codegym.service.MovieService;
import com.codegym.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/promotion")
public class PromotionController {
    @Autowired
    PromotionService promotionService;

    @GetMapping(value={"/list"})
    private ResponseEntity<?> getListPromotion() {
        List<Promotion> promotionList = promotionService.getAllPromotion();
        return ResponseEntity.ok(promotionList);
    }

    @GetMapping(value={"/{id}"})
    public ResponseEntity<?> getPromotion(@PathVariable("id") int id) {
        Promotion promotion = promotionService.getPromotion(id);
        return ResponseEntity.ok(promotion);
    }

    @DeleteMapping(value={"/delete/{id}"})
    public ResponseEntity<?> deletePromotion(@PathVariable("id") int id){
        promotionService.removePromotion(id);
        return ResponseEntity.ok("delete ok");
    }

    @PostMapping(value={"/add"})
    public ResponseEntity<Promotion> addPromotion(@RequestBody Promotion promotion){
        promotionService.savePromotion(promotion);
        return ResponseEntity.ok(promotion);
    }
}