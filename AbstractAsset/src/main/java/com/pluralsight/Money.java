package com.pluralsight;

// AbstractAssets/Cash.java
    public class Money extends Asset {


        public Money(String description, String date, double cost) {
            super(description,date,cost);


        }

        @Override
        public double getValue() {
            return getCost();  // Value does not change
        }
    }


