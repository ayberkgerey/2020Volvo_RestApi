package com.geray.volvoapi.demo.model;


public class Volvo {


    private String serie;
    private String fuelType;
    private String bodyType;
    private int value;
    private float rate;


    public Volvo(String serie, String fuelType, String bodyType, int value, float rate) {
        this.serie = serie;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
        this.value = value;
        this.rate = rate;
    }

    public Volvo() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

}