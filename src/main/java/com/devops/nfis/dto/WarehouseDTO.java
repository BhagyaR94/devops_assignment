package com.devops.nfis.dto;

public class WarehouseDTO {
    long id;
    private String premisesNumber;
    private String street1;
    private String street2;
    private String city;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPremisesNumber() {
        return premisesNumber;
    }

    public void setPremisesNumber(String premisesNumber) {
        this.premisesNumber = premisesNumber;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
