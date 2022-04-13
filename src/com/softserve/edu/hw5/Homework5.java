package com.softserve.edu.hw5;

public class Homework5 {
    public static void main(String[] args) {

        for (Drinks current : Drinks.values()){
            System.out.println("Available: " + current.toString() + " and " + current.getDescription());
        }
    }
}
