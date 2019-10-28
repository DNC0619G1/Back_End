package com.codegym.dao.entity;
import javax.persistence.*;
@Entity
@Table(name = "chair")
public class Chair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chair")
    private int idChair;
    @Column(name = "row_chair")
    private int row;
    @Column(name = "column_chair")
    private int column;
    @Column(name = "chair_detail")
    private int idChairDetail=1;
    @Column(name = "room")
    private int idRoom;
    @Column(name = "status_chair")
    private int statusChair=1;
    @Column(name = "choise_status")
    private boolean choiseStatus=false;
    @Column(name = "position")
    private String position;
    @Column(name = "price_type_chair")
    private int priceChairType;
    @Column(name = "type")
    private String type;

    public Chair() {
    }
    public int getIdChair() {
        return idChair;
    }
    public void setIdChair(int idChair) {
        this.idChair = idChair;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public int getIdChairDetail() {
        return idChairDetail;
    }
    public void setIdChairDetail(int idChairDetail) {
        this.idChairDetail = idChairDetail;
    }

    public boolean isChoiseStatus() {
        return choiseStatus;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getStatusChair() {
        return statusChair;
    }
    public void setStatusChair(int statusChair) {
        this.statusChair = statusChair;
    }
    public boolean getChoiseStatus() {
        return choiseStatus;
    }
    public void setChoiseStatus(boolean choiseStatus) {
        this.choiseStatus = choiseStatus;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getPriceChairType() {
        return priceChairType;
    }
    public void setPriceChairType(int priceChairType) {
        this.priceChairType = priceChairType;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
