package com.softserve.edu.hw14;

import java.util.ArrayList;
import java.util.List;


public class MaxCounter {
    public static void main(String[] args) {
        longListCreator();
        printCountOfMax();
    }

    private static final List<Long> randomList = new ArrayList<>();
    private static final long LIST_LENGTH = 10;
    private static final long UP_TO = 1;

    private static void longListCreator() {
        while (randomList.size() < LIST_LENGTH) {
            randomList.add(Math.round(Math.random() * UP_TO));
        }
        printList();
    }

    private static void printList() {
        System.out.println("\nThe new created list: ");
        randomList.forEach(x -> System.out.print(x + " "));
    }

    private static void printCountOfMax() {
        System.out.printf("\n\nThe count of maximal numbers is: %d\n",
                randomList.stream()
                        .filter(aLong -> aLong.equals(randomList.stream().max(Long::compare).get())).count());
    }
}
