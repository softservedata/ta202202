package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        start();
    }



    private static void start() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        fillListRandomly(list1);
        printList(list1);

        fillListRandomly(list2);
        printList(list2);

        printList(getCommon(list1, list2));
    }

    private static void fillListRandomly(List<Integer> list) {
        if (!list.isEmpty()) {
            list.clear();
        }
        while (list.size() < 10) {
            list.add((int) (Math.round(Math.random() * 10)));
        }
    }

    private static List<Integer> getCommon(List<Integer> list1, List<Integer> list2) {
        list1.retainAll(list2);
        return list1.stream().distinct().collect(Collectors.toList());
    }

    private static void printList(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Given List is empty :(");
        }
        else {
            System.out.println();
            for (Integer i : list) {
                System.out.print(i + " ");
            }
        }
    }
}

