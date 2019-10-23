package com.codegym.dao.entity;

import javax.persistence.*;

@Entity
@Table (name="room")
public class Room {
    @Id
    @Column(name = "id_room")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoom;
    @Column(name="name_room")
    private String name;

    public Room() {
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room(String name) {
        this.name = name;
    }
}
