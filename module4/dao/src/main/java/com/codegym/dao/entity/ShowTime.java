package com.codegym.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "show_time")
public class ShowTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_show_time")
    private int idTime;

    @ManyToOne
    @JoinColumn(name = "id_movie")// thông qua khóa ngoại id_movie
    private Movie movie;

    @JsonFormat(pattern="dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    @Column(name = "show_date")
    private Date showDate;

    @ManyToOne
    @JoinColumn(name = "id_time_frame")
    private TimeFrame showTime;

    @ManyToOne
    @JoinColumn(name = "room")
    private Room room;

    public ShowTime() {
    }
    public int getIdTime() {
        return idTime;
    }
    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getShowDate() {
        return showDate;
    }
    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }
    public TimeFrame getShowTime() {
        return showTime;
    }
    public void setShowTime(TimeFrame showTime) {
        this.showTime = showTime;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}