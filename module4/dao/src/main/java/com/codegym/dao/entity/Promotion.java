package com.codegym.dao.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="promotion")
public class Promotion {
    @Id
    @Column(name = "id_promotion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPromotion;

    private String titlePromotion;



    @Temporal(TemporalType.DATE)

    private Date startDate;


    private Date endDate;

    private int saleOff;

    private String detailPromotion;

    private String imgPromotion;

    public String getImgPromotion() {
        return imgPromotion;
    }

    public void setImgPromotion(String imgPromotion) {
        this.imgPromotion = imgPromotion;
    }

    public Promotion() {
    }

    public Promotion(String titlePromotion, Date startDate, Date endDate, int saleOff, String detailPromotion) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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
