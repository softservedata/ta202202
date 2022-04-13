package com.softserve.edu.hw8;

import java.util.Arrays;
import java.util.Collections;

public class homework8 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Penguin(),
                new Swallow(),
                new Chicken(),
                new Eagle()};
        Arrays.sort(birds, Collections.reverseOrder());
        for (Bird bird: birds) {
            System.out.println(bird);
        }
    }
}
