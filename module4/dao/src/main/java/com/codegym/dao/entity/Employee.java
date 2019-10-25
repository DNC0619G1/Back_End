package com.codegym.dao.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee ")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Long idEmployee;

    @Column(name = "account_employee")
    private String accountEmployee;

    @Column(name = "password_employee")
    private String passwordEmployee;

    @Column(name = "name_employee")
    private String nameEmployee;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_day_employee")
    private Date birthDayEmployee;

    @Column(name = "sex_employee")
    private String sexEmployee;

    @Column(name = "email_employee")
    private String emailEmployee;

    @Column(name = "license_employee")
    private int licenseEmployee;

    @Column(name = "number_phone_employee")
    private int numberPhoneEmployee;

    @Column(name = "address_employee")
    private String  addressEmployee;

    @Column(name = "image_employee")
    private String imageEmployee;


    public Employee(){

    }

    public Employee(String accountEmployee, String passwordEmployee, String nameEmployee, Date birthDayEmployee, String sexEmployee, String emailEmployee, int licenseEmployee, int numberPhoneEmployee, String addressEmployee, String imageEmployee) {
        this.accountEmployee = accountEmployee;
        this.passwordEmployee = passwordEmployee;
        this.nameEmployee = nameEmployee;
        this.birthDayEmployee = birthDayEmployee;
        this.sexEmployee = sexEmployee;
        this.emailEmployee = emailEmployee;
        this.licenseEmployee = licenseEmployee;
        this.numberPhoneEmployee = numberPhoneEmployee;
        this.addressEmployee = addressEmployee;
        this.imageEmployee = imageEmployee;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getAccountEmployee() {
        return accountEmployee;
    }

    public void setAccountEmployee(String accountEmployee) {
        this.accountEmployee = accountEmployee;
    }

    public String getPasswordEmployee() {
        return passwordEmployee;
    }

    public void setPasswordEmployee(String passwordEmployee) {
        this.passwordEmployee = passwordEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Date getBirthDayEmployee() {
        return birthDayEmployee;
    }

    public void setBirthDayEmployee(Date birthDayEmployee) {
        this.birthDayEmployee = birthDayEmployee;
    }

    public String getSexEmployee() {
        return sexEmployee;
    }

    public void setSexEmployee(String sexEmployee) {
        this.sexEmployee = sexEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public int getLicenseEmployee() {
        return licenseEmployee;
    }

    public void setLicenseEmployee(int licenseEmployee) {
        this.licenseEmployee = licenseEmployee;
    }

    public int getNumberPhoneEmployee() {
        return numberPhoneEmployee;
    }

    public void setNumberPhoneEmployee(int numberPhoneEmployee) {
        this.numberPhoneEmployee = numberPhoneEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public String getImageEmployee() {
        return imageEmployee;
    }

    public void setImageEmployee(String imageEmployee) {
        this.imageEmployee = imageEmployee;
    }

}
