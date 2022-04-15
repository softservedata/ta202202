package com.softserve.edu.hw8;

import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        Bird[] birdsList = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Chicken()
        };

        Arrays.sort(birdsList);
        for (int i = 0; i < birdsList.length; i++) {
            System.out.println(birdsList[i]);
        }
    }
}