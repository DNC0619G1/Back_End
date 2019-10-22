package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.Set;

@Table(name = "`movie`" ,schema = "cinema_module4")
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id_movie`")
    private Integer idMovie;
    private String nameMovie;
    private String cateloryMovie;
    private String actor;
    private String author;
    private String studioMovie;
    private String duration;
    private String content;
    private  String showings;
@ManyToOne
    private  Order order;
    public Movie() {
    }

    public Movie( String showings, Order order,   String nameMovie, String cateloryMovie, String actor, String author, String studioMovie, String duration, String content) {
       this.showings =showings;
       this.order =order;
        this.nameMovie = nameMovie;
        this.cateloryMovie = cateloryMovie;
        this.actor = actor;
        this.author = author;
        this.studioMovie = studioMovie;
        this.duration = duration;
        this.content = content;
    }
//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public String getShowings() {
        return showings;
    }

    public void setShowings(String showings) {
        this.showings = showings;
    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getCateloryMovie() {
        return cateloryMovie;
    }

    public void setCateloryMovie(String cateloryMovie) {
        this.cateloryMovie = cateloryMovie;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStudioMovie() {
        return studioMovie;
    }

    public void setStudioMovie(String studioMovie) {
        this.studioMovie = studioMovie;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}