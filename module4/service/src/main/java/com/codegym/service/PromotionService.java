package com.codegym.service;

import com.codegym.dao.entity.Promotion;

import java.util.Date;
import java.util.List;

public interface PromotionService {
    List<Promotion> getAllPromotion();
    List<Promotion> getAllPromotionByEndDate(Date date);
    Promotion getPromotion(int id);

    void removePromotion(int id);

    Promotion savePromotion(Promotion promotion);

    List<Promotion> searchPromotion(String title);

    List<Promotion> searchPromotionByDate(Date startDate, Date endDate);

    Promotion deletePromotion(int idPromotion);

}
