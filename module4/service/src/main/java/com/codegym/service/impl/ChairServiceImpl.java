package com.codegym.service.impl;

import com.codegym.dao.entity.Chair;
import com.codegym.dao.repository.ChairRepository;
import com.codegym.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
class ChairServiceImpl implements ChairService {
    @Autowired
    private ChairRepository chairRepository;

    @Override
    public List<Chair> getChairs() {
        return chairRepository.findAll();
    }

    @Override
    public Chair getChairById(int id) {
        return chairRepository.findById(id).orElse(null);
    }


    @Override
    public void saveChair(Chair chair) {
        Chair chair1 = new Chair();
        chair1.setIdChairDetail(chair.getIdChairDetail());
        if (chair.getIdChairDetail() == 2) {
            chair1.setPriceChairType(10000);
            chair1.setType("VIP");
        }
        if (chair.getIdChairDetail() == 1) {
            chair1.setPriceChairType(0);
            chair1.setType("Normal");
        }
        chair1.setIdChair(chair.getIdChair());
        chair1.setRoom(chair.getRoom());
        chair1.setColumn(chair.getColumn());
        chair1.setRow(chair.getRow());
        chair1.setPosition(chair.getPosition());
        chair1.setChoiseStatus(chair.getChoiseStatus());
        chair1.setStatusChair(chair.getStatusChair());
        chairRepository.save(chair1);
    }

    @Override
    public void updateChair(Chair chair) {

    }

    @Override
    public void deleteChair(int idChair) {
        chairRepository.deleteById(idChair);
    }

//    @Override
//    public Map<Integer, List<Chair>> getChairsMap() {
//        List<Chair> chairs = chairRepository.findAll();
//        return chairs.stream()
//                .collect(Collectors.toMap(Chair::getRoom().get,
//                        p -> {
//                            List<Chair> list = new ArrayList<>();
//                            list.add(p);
//                            return list;
//                        }, (oldValue, newValue) -> {
//                            newValue.addAll(oldValue);
//                            return newValue;
//                        }));
//    }
}