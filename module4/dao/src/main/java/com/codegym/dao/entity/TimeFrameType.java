package com.codegym.dao.entity;

import javax.persistence.*;
@Entity
@Table(name = "time_frame_type")
public class TimeFrameType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    private int idType;

    @JoinColumn(name="price_type")
    private int priceType;

    @JoinColumn(name="type")
    private String type;

    public TimeFrameType() {//ham khoi tao
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
