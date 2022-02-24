package com.etpl.exrerices.collections;

public class Carp {
    String make;
    String name;
    String type;
    float basePrice;

    String trim;

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }


    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }
    public Carp(){

    }

    public Carp(String make, String name, String type, float basePrice, String trim) {
        this.make = make;
        this.name = name;
        this.type = type;
        this.basePrice = basePrice;
        this.trim = trim;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Carp{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", basePrice=" + basePrice +
                ", trim='" + trim + '\'' +
                '}';
    }
}
