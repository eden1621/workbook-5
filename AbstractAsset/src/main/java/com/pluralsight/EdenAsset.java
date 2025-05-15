package com.pluralsight;

import java.util.ArrayList; //ArrayList to store a list of Asset objects.
//
public class EdenAsset {
    public static void main(String[] args) {// my main method
        ArrayList<Asset> assets = new ArrayList<>();//Creates a list that can store any object that is a subclass of Asset both house and car

        // Adding House objects
        assets.add(new House("Party Home", "2025-08-14", 150000, "1640 Nicole", 1, 2000, 5000));
        assets.add(new House("Apartment", "2023-04-10", 120000, "456 Main St", 3, 1200, 3000));

        // Adding Vehicle objects
        assets.add(new Vehicle("Jo's Car", "2025-07-16", 20000, "Honda Civic", 2020, 35000));
        assets.add(new Vehicle("John's Truck", "2018-04-23", 25000, "Nissan Rogue ", 2014, 150000));

        for (Asset asset : assets) { //This is a for-each loop that goes through every object in the assets list.


            System.out.println("Description: " + asset.getDescription()); // use public getter methods like getDescription() that safely expose the data.
            System.out.println("Date Acquired: " + asset.getDate());
            System.out.println("Original Cost: " + asset.getCost());
            System.out.println("Value: " + asset.getValue());
            // Now check: is it a House?
            if (asset instanceof House) { //checks the actual type of the object at runtime.
                House house = (House) asset;  // Tell Java: “this is a house”
                System.out.println("Address: " + house.address);  // Show house's address
            }
            // Or is it a Vehicle?
            else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;  // Tell Java: “this is a car”
                System.out.println("Make/Model: " + vehicle.makeModel + ", Year: " + vehicle.year);  // Show car info
            }

            // Leave a blank line after each one //easier to read by putting a space between asset entries.
            System.out.println();

        }
    }
}
