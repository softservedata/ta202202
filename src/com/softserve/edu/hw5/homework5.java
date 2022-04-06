package com.softserve.edu.hw5;

public class homework5 {
    public static void main(String[] args) {
        for (Drinks drink : Drinks.values()) {
            String name = drink.name().substring(0, 1).toUpperCase() + drink.name().substring(1).toLowerCase();
            System.out.println(name + "'s description is \"" + drink.getDescription() + "\"" + "\n also known as");
            System.out.println(drink + "\n"); //showing off the overridden toString() method
        }
    }
}
