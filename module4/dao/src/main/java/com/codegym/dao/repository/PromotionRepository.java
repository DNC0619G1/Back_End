package com.codegym.dao.repository;

import com.codegym.dao.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
    Promotion findByIdPromotion(int id);

    void deleteByIdPromotion(int id);

    List<Promotion> findAllByTitlePromotionContaining(String title);
}
