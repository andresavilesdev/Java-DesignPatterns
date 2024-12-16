package com.java.domain;

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

    public String getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
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
