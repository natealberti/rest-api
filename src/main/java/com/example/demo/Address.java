package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    
    private String country;
    private String postCode;
    private String city;

    public Address(String country, String city, String postcode) {
        this.country = country;
        this.city = city;
        this.postCode = postcode;
    }
}
