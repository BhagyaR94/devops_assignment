package com.devops.nfis.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name="premises_number")
    private String premisesNumber;

    @Column(name="street_1")
    private String street1;

    @Column(name="street_2")
    private String street2;

    @Column(name="city")
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
