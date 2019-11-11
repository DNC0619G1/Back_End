package com.codegym.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDTO implements Serializable {
    private Long idUser;
    private String userName;
    private String password;
    private String fullName;
    private Date birthDay;
    private String sex;
    private String email;
    private int license;
    private int numberPhone;
    private String address;
    private String nameMemberCard;
    private int point;
    private Long idRole;
    public UserDTO(){

    }

    public UserDTO(Long idUser, String userName, String password, String fullName, Date birthDay, String sex, String email, int license, int numberPhone, String address, String nameMemberCard, int point, Long idRole) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.sex = sex;
        this.email = email;
        this.license = license;
        this.numberPhone = numberPhone;
        this.address = address;
        this.nameMemberCard = nameMemberCard;
        this.point = point;
        this.idRole = idRole;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



    public String getNameMemberCard() {
        return nameMemberCard;
    }

    public void setNameMemberCard(String nameMemberCard) {
        this.nameMemberCard = nameMemberCard;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
