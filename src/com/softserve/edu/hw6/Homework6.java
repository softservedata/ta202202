package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Drinks;

public class Homework6 {
    public static void main(String[] args) {
        Pub winePubOne = new Pub("Wine Pub Lviv","WINE", 11);
        Pub coffeePubOne = new Pub("Coffee pub Rivne","COFFEE", 5);
        Pub waterPubOne = new Pub("Pub with water","WATER", 2);
        Pub winePubTwo = new Pub("Wine Pub Odessa","WINE", 11);
        Pub coffeePubTwo = new Pub("Coffee pub Kyiv","COFFEE", 2);

        Pub[] pubsList = {winePubOne, coffeePubOne, waterPubOne, winePubTwo, coffeePubTwo};
        for (int i = 0; i < pubsList.length; i++) {
            for (int j = i + 1; j < pubsList.length; j++) {
                if (pubsList[i].getDrinkPrice() == pubsList[j].getDrinkPrice()) {
                    System.out.print(pubsList[i].getPubName() + " has the same price for drinks as " + pubsList[j].getPubName() + "\n");
                    System.out.println(pubsList[i].getDrinkType() + " price is " + pubsList[i].getDrinkPrice() + " and " +
                            pubsList[j].getDrinkType() + " price is " + pubsList[j].getDrinkPrice() + "\n");
                }
            }
        }
    }
}
