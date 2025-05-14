package com.pluralsight;

import java.util.ArrayList;

public class EdenAsset {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // Adding House objects
        assets.add(new House("Party Home", "2025-08-14", 150000, "1640 Nicole", 1, 2000, 5000));
        assets.add(new House("Apartment", "2023-04-10", 120000, "456 Main St", 3, 1200, 3000));

        // Adding Vehicle objects
        assets.add(new Vehicle("Jo's Car", "2025-07-16", 20000, "Honda Civic", 2020, 35000));
        assets.add(new Vehicle("John's Truck", "2018-04-23", 25000, "Nissan Rogue ", 2014, 150000));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.description);
            System.out.println("Date Acquired: " + asset.date);
            System.out.println("Original Cost: " + asset.Cost);
            System.out.println("Value: " + asset.getValue());
            // Now check: is it a House?
            if (asset instanceof House) {
                House house = (House) asset;  // Tell Java: “this is a house”
                System.out.println("Address: " + house.address);  // Show house's address
            }
            // Or is it a Vehicle?
            else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;  // Tell Java: “this is a car”
                System.out.println("Make/Model: " + vehicle.makeModel + ", Year: " + vehicle.year);  // Show car info
            }

            // Leave a blank line after each one
            System.out.println();

        }
    }
}
