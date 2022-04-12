package com.softserve.edu.hw5;

public enum Drinks {
    WATER("Water is good to be cold to drink"),
    COFFEE("Coffee is good in the morning"),
    WINE("Wine is always good :)");

    public String description;

    private Drinks (String description) {
        this.description = description;
    }

    public String getDescription () {
        return  description.toString();
    }
}
