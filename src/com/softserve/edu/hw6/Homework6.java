package com.softserve.edu.hw6;


import static com.softserve.edu.hw6.Pub.Drinks.*;

public class Homework6 {
    public static void main(String[] args) {
        Pub pub1 = new Pub(COFFE, 25.75);
        Pub pub2 = new Pub(WATER, 25.75);
        Pub pub3 = new Pub(WINE, 125.00);
        Pub pub4 = new Pub(WINE, 12.00);
        Pub pub5 = new Pub(COFFE, 25.75);

        Pub[] pubs = {pub1, pub2, pub3, pub4, pub5};

        for (int i = 0; i < pubs.length - 1; i++) {
            for (int j = i + 1; j < pubs.length; j++) {
                if (pubs[i].equals(pubs[j])) {
                    System.out.println("same products are: " + pubs[j]);
                }
            }
        }
    }
}
