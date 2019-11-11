package com.codegym.dao.entity;

import javax.persistence.*;
@Entity
@Table(name = "price_ticket")
public class PriceTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_price_ticket")
    private int idPriceTicket;

    @JoinColumn(name="day_price")
    private int dayPrice;

    @JoinColumn(name="day_week")
    private int dayWeek;

    @ManyToOne
    @JoinColumn(name ="id_timeframe_type")
    private TimeFrameType timeFrameType;

    public PriceTicket() {//ham khoi tao
    }

    public int getIdPriceTicket() {
        return idPriceTicket;
    }

    public void setIdPriceTicket(int idPriceTicket) {
        this.idPriceTicket = idPriceTicket;
    }

    public int getDayWeekPrice() {
        return dayPrice;
    }

    public void setDayWeekPrice(int dayWeekPrice) {
        this.dayPrice = dayWeekPrice;
    }

    public int getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(int dayWeek) {
        this.dayWeek = dayWeek;
    }

    public TimeFrameType getTimeFrameType() {
        return timeFrameType;
    }

    public void setTimeFrameType(TimeFrameType timeFrameType) {
        this.timeFrameType = timeFrameType;
    }
}
