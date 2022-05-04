package com.softserve.edu.hw10;

import java.util.List;

import static com.softserve.edu.hw9.homework9.createRandomIntegerArrayList;

public class homework10 {
    public static void main(String[] args) {
        List<Integer> list1 = createRandomIntegerArrayList(10, 3);
        List<Integer> list2 = createRandomIntegerArrayList(7, 3);
        System.out.println("1st list has the following elements: " + list1);
        System.out.println("2nd list has the following elements: " + list2);
        System.out.println("Do the lists contain the same elements? " +
                (list1.containsAll(list2) && list2.containsAll(list1)));
    }
}
