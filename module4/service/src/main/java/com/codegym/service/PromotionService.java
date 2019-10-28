package com.codegym.service;

import com.codegym.dao.entity.Promotion;

import java.util.List;

public interface PromotionService {
    List<Promotion> getAllPromotion();

    Promotion getPromotion(int id);

    void removePromotion(int id);
}
