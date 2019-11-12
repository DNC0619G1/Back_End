package com.codegym.dao.repository;

import com.codegym.dao.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Integer> {
//    @Query(value = "SELECT max(idOrder) FROM Order")
//    public int maxIdOrder();
}
