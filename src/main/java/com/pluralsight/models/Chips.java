package com.pluralsight.models;

public class Chips implements Menu{
    private String type;
    public Chips(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return type + " chips - $" + String.format("%.2f", getPrice());
    }
}