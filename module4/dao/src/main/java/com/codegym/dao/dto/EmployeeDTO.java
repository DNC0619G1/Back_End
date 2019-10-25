package com.codegym.dao.dto;


import java.io.Serializable;
import java.util.Date;

public class EmployeeDTO implements Serializable {

    private Long idEmployee;

    private String accountEmployee;

    private String passwordEmployee;

    private String nameEmployee;

    private Date birthDayEmployee;

    private String sexEmployee;

    private String emailEmployee;

    private int licenseEmployee;

    private int numberPhoneEmployee;

    private String  addressEmployee;


    private String imageEmployee;

    public EmployeeDTO(){

    }

    public EmployeeDTO(Long idEmployee, String accountEmployee, String passwordEmployee, String nameEmployee, Date birthDayEmployee, String sexEmployee, String emailEmployee, int licenseEmployee, int numberPhoneEmployee, String addressEmployee, String imageEmployee) {
        this.idEmployee = idEmployee;
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

