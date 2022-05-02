package com.softserve.edu.hw8;

import java.util.Arrays;


public class HomeWork8 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Chicken(),
                new Chicken(),
                new Swallow(),
                new Penguin(),
                new Eagle(),
                new Chicken(),
                new Swallow()};
        System.out.println("Original list \n" + Arrays.toString(birds));
        Arrays.sort(birds);
        System.out.println("Sorted list \n" + Arrays.toString(birds));
    }
}
