package com.pluralsight;

public class Abstract {
    // AbstractAssets/Asset.java
    public abstract class Asset {
        private final String name;

        public Asset(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // Abstract method must be implemented by subclasses
        public abstract double getValue();
    }

}
