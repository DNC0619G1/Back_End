package com.codegym.dao.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_day")
    private Date birthDay;

    @Column(name = "sex")
    private String sex;

    @Column(name = "email")
    private String email;

    @Column(name = "license")
    private int license;

    @Column(name = "number_phone")
    private int numberPhone;

    @Column(name = "address")
    private String  address;

    @Column(name = "name_member_card")
    private String nameMemberCard;

    @Column(name = "point")
    private int point;

    @Column(name = "id_role")
    private Long idRole;

    public User(){

    }

    public User(String userName, String password, String fullName, Date birthDay, String sex, String email, int license, int numberPhone, String address, String nameMemberCard, int point, Long idRole) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
