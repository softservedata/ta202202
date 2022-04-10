package com.softserve.edu.hw5;

enum Drinks {
    WATER("Mineral water"),
    COFFEE("Coffee, Arabica 100%"),
    WINE("Red wine, semi-dry");
    private final String description;

    Drinks(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drinks[" + "Name: " + name() +
                " Description: " + description +
                "]";
    }
}
