package com.pluralsight.models;

public class Topping{
    private String name;
    private boolean isPremium;
    private boolean isExtra;

    public Topping(String name, boolean isPremium, boolean isExtra) {
        this.name = name;
        this.isPremium = isPremium;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }
    // Returns a string like (extra)"
    @Override
    public String toString() {
        return name + (isExtra ? " (extra)" : "");
    }
}