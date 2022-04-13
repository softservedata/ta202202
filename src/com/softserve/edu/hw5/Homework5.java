package com.softserve.edu.hw5;

public class Homework5 {
    public static void main(String[] args) {

        Drinks product1 = Drinks.COFFE;
        Drinks product2 = Drinks.WATER;
        Drinks product3 = Drinks.WINE;

        for (Drinks current : Drinks.values()){
            System.out.println("Available: " + current.toString() + " and " + current.getDescription());
        }
    }
}
