package com.codegym.dao.repository;

import com.codegym.dao.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
    Promotion findByIdPromotion(int id);

    void deleteByIdPromotion(int id);

    @Query("select p from Promotion p where p.endDate >=:date")
    List<Promotion> findAllByEndDateAfter(Date date);
}
