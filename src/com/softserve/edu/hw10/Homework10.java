package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;

public class Homework10 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(0);
        list1.add(8);
        list1.add(1);

        list2.add(2);
        list2.add(0);
        list2.add(2);
        list2.add(8);

        if ((list1.containsAll(list2)) && (list2.containsAll(list1))){
            System.out.println("The contents of two lists are the same.");
        }
        else {
            System.out.println("The contents of two lists are NOT the same.");
        }
    }
}
