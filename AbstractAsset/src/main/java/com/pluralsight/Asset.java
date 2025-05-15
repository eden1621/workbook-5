package com.pluralsight;

public abstract class Asset {
    private String description; //
    private String date; // When the asset was acquired
    private double Cost; // purchase price
//Access and modify private fields
    public String getDescription() {//to ger description field from outside the class
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
//This constructor called when creatin an Asset object , it initializes all fields when a new object is created
    public Asset(String description, String date, double cost) {
        this.description = description;
        this.date = date;
        Cost = cost;
    }
//This method return the value of the asset. //default = cost
    public double getValue() {

      return Cost;
    }
}






