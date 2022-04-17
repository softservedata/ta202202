package com.softserve.edu.hw8;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle("eagle John"),
                new Eagle("eagle Mark"),
                new Swallow("swallow Marta"),
                new Penguin("penguin Kyle"),
                new Chicken("chicken Lee")
        };
        Arrays.sort(birds);
        System.out.println("Sorted array of birds: " + Arrays.toString(birds));
    }
}