package com.makaan.controllers;

import java.io.Serializable;

public class Request implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6105439397385319331L;
    private String            name;
    private int               number;
    private String            value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
