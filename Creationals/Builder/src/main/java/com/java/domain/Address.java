package com.java.domain;

import lombok.Data;

@Data
public class Address {

        private String mainAddress;
        private String city;
        private String country;
        private String cp;

    public Address() {
    }

    public Address(String mainAddress, String city, String country, String cp) {
        this.mainAddress = mainAddress;
        this.city = city;
        this.country = country;
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + mainAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}
