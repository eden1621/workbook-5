package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset  {
        String makeModel;
        int year;
        int odometer;

        public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
            super(description, dateAcquired, originalCost);
            this.makeModel = makeModel;
            this.year = year;
            this.odometer = odometer;
        }

        @Override
        public double getValue() {
            // => age currentYear - this.year
            //if vehicle less then 3% of it is value each year, we are keeping 97% of it is value each year 0-3 years
            //if vehicle less then 6% of it is value each year, we are keeping 94% of it is value each year 4 -6years
            //if vehicle less then 8% of it is value each year, we are keeping 92% of it is value each year 7-10 years

           int currentYear = LocalDate.now().getYear();
           int age = currentYear-year;
            double value = 0.0;

            if (age <= 3) {
             value=getCost() * Math.pow(0.97,age);
            } else if (age <= 6) {
                value=getCost() * Math.pow(0.94,age);

            } else if (age <= 8) {
                value=getCost() * Math.pow(0.92,age);

            }

            if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
                value -= value * 0.25;  // Reduce by 25% if over 100k miles, unless it's a Honda/Toyota
            }

            return value;
        }


    }



