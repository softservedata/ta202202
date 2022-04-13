package com.softserve.edu.hw5;

enum Drinks {
    WATER("Morshynska"),
    COFFE("Arabica 80%"),
    WINE("Kindzmarauli");

    private String description;

    private Drinks (String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return "Drink is " + name();
    }

    public String getDescription() {
        return "description - " + description;
    }
}
