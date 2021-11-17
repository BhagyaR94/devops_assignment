package com.devops.nfis.dto;

import com.devops.nfis.FertilizerType;

import java.util.Date;

public class FertilizerDTO {
    long id;
    private String name;
    private String brandName;
    private FertilizerType type;
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
