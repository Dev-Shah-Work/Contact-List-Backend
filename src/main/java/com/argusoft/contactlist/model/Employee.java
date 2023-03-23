package com.argusoft.contactlist.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // To make sure that this class is map to any database we configure
public class Employee implements Serializable {/*
                                                * Serializable transforsm java class into different kinds of string as
                                                * it is going to be sent to database,converted into json and much more
                                                */

   

    @Id // Below attribute is an id
    @GeneratedValue(strategy = GenerationType.AUTO) // How do we want to generate an ID
    @Column(nullable = false, updatable = false) // Specifying some constraints for a particular attribute
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String employeeCode;
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }


    @Column(nullable = false, updatable = false) // Specifying some constraints for a particular attribute

    @Override
    public String toString() {
        return "Employee {id=" + id + ", name=" + name + ", email=" + email + ", jobTitle=" + jobTitle + ", phone="
                + phone + ", imageUrl=" + imageUrl + ", employeeCode=" + employeeCode + "}";
    }
}
