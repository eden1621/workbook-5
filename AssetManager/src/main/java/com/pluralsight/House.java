package com.pluralsight;

public class House extends Asset {

        String address;
        int condition;
        int squareFoot;
        int lotSize;

        public House(String description, String date, double Cost, String address, int condition, int squareFoot, int lotSize) {
            super(description, date, Cost);
            this.address = address;
            this.condition = condition;
            this.squareFoot = squareFoot;
            this.lotSize = lotSize;
        }

        @Override
        public double getValue() {
            double value = 0;
            switch (condition) {
                case 1: value = squareFoot * 180; break;  // Excellent
                case 2: value = squareFoot * 130; break;  // Good
                case 3: value = squareFoot * 90; break;   // Fair
                case 4: value = squareFoot * 80; break;   // Poor
            }
            value += lotSize * 0.25;  // Plus 25 cents per square foot of lot size
            return value;
        }

        // Getters and setters...
    }



