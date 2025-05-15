package com.pluralsight; // it will help to avoid name conflicts between classes

public class House extends Asset {//This line declares the House class and says it inherits from Asset

        String address;// house's location
        int condition;// if the house in good or bad condition
        int squareFoot;
        int Size;//Size of the land in square feet

        public House(String description, String date, double Cost, String address, int condition, int squareFoot, int lotSize) {
            super(description, date, Cost); //Calls super(...) to pass description, date, and Cost to the Asset constructor
            this.address = address;
            this.condition = condition;
            this.squareFoot = squareFoot;
            this.Size = lotSize;//Size of the land in square feet
        }

        @Override //This method overrides the getValue() method from Asset.
        public double getValue() {
            double value = 0;
            switch (condition) {
                //Calculates value of house based on condition and size
                case 1: value = squareFoot * 180; break;  // Excellent //squareFoot × a price- based on condition
                case 2: value = squareFoot * 130; break;  // Good
                case 3: value = squareFoot * 90; break;   // Fair
                case 4: value = squareFoot * 80; break;   // Poor
            }
            value += Size * 0.25;  // Plus 25 cents per square foot of lot size //This adds the land value to the current house value which was already calculated based on the house’s condition and square footage.
            return value;
        }


    }



