package com.softserve.edu.hw10;

import java.util.*;

public class homework10 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        int length = 10;
        Random num = new Random();

        for (int i = 0; i < length; i++) {
            list1.add(num.nextInt(4));
        }
        for (int i = 0; i < length; i++) {
            list2.add(num.nextInt(4));
        }
        System.out.println("First list \n" + list1);
        System.out.println("Second list \n" + list2);

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        System.out.println("The content of the lists are similar? " + set1.equals(set2));

    }
}
