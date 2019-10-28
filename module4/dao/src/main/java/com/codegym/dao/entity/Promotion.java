package com.codegym.dao.entity;
import javax.persistence.*;

@Entity
@Table (name="promotion")
public class Promotion {
    @Id
    @Column(name = "id_promotion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPromotion;

    private String titlePromotion;

    private String startDate;

    private String endDate;

    private int saleOff;

    private String detailPromotion;

    public Promotion() {
    }

    public Promotion(String titlePromotion, String startDate, String endDate, int saleOff, String detailPromotion) {
        this.titlePromotion = titlePromotion;
        this.startDate = startDate;
        this.endDate = endDate;
        this.saleOff = saleOff;
        this.detailPromotion = detailPromotion;
    }

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    public String getTitlePromotion() {
        return titlePromotion;
    }

    public void setTitlePromotion(String titlePromotion) {
        this.titlePromotion = titlePromotion;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getSaleOff() {
        return saleOff ;
    }

    public void setSaleOff(int saleOff) {
        this.saleOff = saleOff;
    }

    public String getDetailPromotion() {
        return detailPromotion;
    }

    public void setDetailPromotion(String detailPromotion) {
        this.detailPromotion = detailPromotion;
    }
}
