package com.codegym.dao.entity;

import javax.persistence.*;

@Table(name = "`time_frame`" ,schema = "cgv_codegym")
@Entity
public class TimeFrame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id_time_frame`")
    private  int idTimeFrame;

    @Column(name = "price")
    private int priceTime;

    @Column(name = "time")
    private String timeStart;

    public TimeFrame(int priceTime, String timeStart) {
        this.priceTime = priceTime;
        this.timeStart = timeStart;
    }

    public TimeFrame() {
    }

    public int getIdTimeFrame() {
        return idTimeFrame;
    }

    public void setIdTimeFrame(int idTimeFrame) {
        this.idTimeFrame = idTimeFrame;
    }

    public int getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(int priceTime) {
        this.priceTime = priceTime;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }
}


