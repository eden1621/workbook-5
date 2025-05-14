package com.pluralsight;

public class Asset {
    private String description;
    private String date;
    private double Cost;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public Asset(String description, String date, double cost) {
        this.description = description;
        this.date = date;
        Cost = cost;
    }

    public double getValue() {

      return Cost;
    }
}






