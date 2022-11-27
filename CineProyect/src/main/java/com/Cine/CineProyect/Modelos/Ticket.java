package com.Cine.CineProyect.Modelos;

public class Ticket {
    String id;
    double value;
    String type;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
