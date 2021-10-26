package com.springmsa.skywalker.form;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class BookingsForm {

    private String lastName;
    private String firstName;
    private Date birthDate;
    private String licenseNumber;
    private Date licenseDate;
    private Date startDate;
    private Date endDate;

    public BookingsForm(String lastName, String firstName, Date birthDate, String licenseNumber, Date licenseDate, Date startDate, Date endDate) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.licenseNumber = licenseNumber;
        this.licenseDate = licenseDate;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public BookingsForm(){

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(Date licenseDate) {
        this.licenseDate = licenseDate;
    }
}