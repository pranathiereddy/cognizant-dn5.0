package com.cognizant.ormlearn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code", length = 2)
    private String code;

    @Column(name = "co_name", length = 50, nullable = false)
    private String name;

    // Default constructor required by JPA/Hibernate
    public Country() {
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Overridden toString method for clean console reading during tests
    @Override
    public String toString() {
        return String.format("Country[Code: %s, Name: %s]", code, name);
    }
}