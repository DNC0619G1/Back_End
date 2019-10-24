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
    private String nameRoom;
    @Column(name="description")
    private String description;

    public Room() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }
}
