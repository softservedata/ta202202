package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        List<Integer> list2 = new ArrayList<>() {
            {
                add(3);
                add(2);
                add(3);
                add(1);
            }
        };
        areSetsEqual(list1, list2);
    }



    private static void areSetsEqual(List<Integer> list1, List<Integer> list2) {
        if ((list1.containsAll(list2)) && (list2.containsAll(list1))) {
            System.out.println("Given lists have the same set of unique elements");
        }
        else {
            System.out.println("Given lists have different sets of unique elements");
        }
    }
}


