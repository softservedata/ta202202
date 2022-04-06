package com.softserve.edu.hw5;

public enum Drinks {
    WATER("Refreshing hydration!"),
    COFFEE("Morning doesn't start with it ;)"),
    WINE("Commonly used antidepressant."),
    TEST(); //showing off the non-parametrized constructor

    public final String description;

    Drinks(String description) {
        this.description = description;
    }

    Drinks() {
        this.description = "No one bothered to write a description here.";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name() + " - " + this.description.toLowerCase();
    }
}