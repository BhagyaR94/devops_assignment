package com.devops.nfis.entity;

import com.devops.nfis.FertilizerType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Fertilizer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name="name")
    private String name;

    @Column(name="brand_name")
    private String brandName;

    @Column(name="type")
    private FertilizerType type;

    @Column(name="exp")
    private Date exp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public FertilizerType getType() {
        return type;
    }

    public void setType(FertilizerType type) {
        this.type = type;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }
}
