package com.example.countryapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {

    @Id
    private String coCode;

    private String coName;

    // Constructors
    public Country() {}

    public Country(String coCode, String coName) {
        this.coCode = coCode;
        this.coName = coName;
    }

    // Getter and Setter for coCode
    public String getCoCode() {
        return coCode;
    }

    public void setCoCode(String coCode) {
        this.coCode = coCode;
    }

    // Getter and Setter for coName
    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }
}
