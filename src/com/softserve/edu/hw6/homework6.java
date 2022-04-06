package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Drinks;

import java.util.ArrayList;
import java.util.HashSet;

public class homework6 {
    public static void main(String[] args) {
        Pub pub1 = new Pub("Red Lion",          Drinks.WATER,   1.0); // 2+ duplicates
        Pub pub2 = new Pub("Royal Oak",         Drinks.WINE,    1.0); // 2 duplicates
        Pub pub3 = new Pub("White Horse",       Drinks.COFFEE,  1.0);
        Pub pub4 = new Pub("Queen's Head",      Drinks.WATER,   1.0);
        Pub pub5 = new Pub("Green Dragon",      Drinks.WATER,   1.0);
        Pub pub6 = new Pub("Blacksmiths Arms",  Drinks.WINE,    1.0);
        Pub pub7 = new Pub("Halfway House",     Drinks.WINE,    2.0); // no duplicates
        Pub[] pubs = {pub1, pub2, pub3, pub4, pub5, pub6, pub7}; // pubs.length >5 to show off different scenarios
        HashSet<Pub> duplicateList = new HashSet<>(); // using HashSet to store pubs to print while avoiding duplicates
        ArrayList<Integer> tracker = new ArrayList<>();
        for (int i = 0; i < pubs.length; i++) {
            for (int j = i + 1; j < pubs.length; j++) {
                if (pubs[i].equals(pubs[j])) {
                    if (!tracker.contains(i) || !tracker.contains(j)) {
                        tracker.add(i);
                        tracker.add(j);
                        duplicateList.add(pubs[i]);
                        duplicateList.add(pubs[j]);
                    }
                }
            }
            if (!duplicateList.isEmpty()) {
                printDuplicateList(duplicateList);
            }
        }
        tracker.clear();
        showAfterword(pub3);
    }

    // kinda convoluted but necessary if there are >2 equal pubs, and you want to print them in a pretty sentence
    private static void printDuplicateList(HashSet<Pub> duplicateList) {
        int i = 1;
        for (Pub pub : duplicateList) {
            if(i == duplicateList.toArray().length) {
                System.out.print("\"" + pub.getName() + "\"");
            }
            else if (i == duplicateList.toArray().length-1) {
                System.out.print("\"" + pub.getName() + "\"" + " and ");
                i++;
            }
            else {
                System.out.print("\"" + pub.getName() + "\"" + ", ");
                i++;
            }
        }
        // getting an element of a HashSet w/o using an iterator is hard :(
        System.out.print(" serve the same drink for the same price (" +
                duplicateList.iterator().next().getDrinkType().name().toLowerCase() + " for " +
                duplicateList.iterator().next().getPrice() + ").\n");
        duplicateList.clear();
    }

    private static void showAfterword(Pub pub) {
        try {Thread.sleep(5000);
        } catch (InterruptedException ignored) {}
        System.out.println("\nWhile there are no duplicates for " + pub.getName() +
                ", I still want to use my overridden toString() method :3");
        System.out.println(pub);
    }
}