package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    public Address(String string, String string2, String string3) {
    }
    private String country;
    private String postCode;
    private String city;
}
