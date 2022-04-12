package com.softserve.edu.hw5;

public class Homework5 {
    public static void main(String[] args) {
        for (Drinks drink : Drinks.values()) {
            System.out.println(drink.getDescription());
        }
    }
}
