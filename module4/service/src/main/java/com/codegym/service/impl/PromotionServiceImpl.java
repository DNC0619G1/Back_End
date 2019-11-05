package com.codegym.service.impl;

import com.codegym.dao.entity.Promotion;
import com.codegym.dao.repository.PromotionRepository;
import com.codegym.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
@Transactional
@Service
public class PromotionServiceImpl implements PromotionService {
    @Autowired
    PromotionRepository promotionRepository;

    @Override
    public List<Promotion> getAllPromotion() {
        return promotionRepository.findAll();
    }

    @Override
    public List<Promotion> getAllPromotionByEndDate(Date date) {
        return promotionRepository.findAllByEndDateAfter(date);
    }

    @Override
    public Promotion getPromotion(int id) {
        return promotionRepository.findByIdPromotion(id);
    }

    @Override
    public void removePromotion(int id) {
        promotionRepository.deleteByIdPromotion(id);
    }
}
