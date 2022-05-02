package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        ListCreator lc = new ListCreator();
    }
}

class ListCreator {

    private final List<Integer> list1;
    private final List<Integer> list2;

    ListCreator() {
        this.list1 = new ArrayList<>();
        this.list2 = new ArrayList<>();
        start();
    }

    private void start() {
        fillListRandomly(this.list1);
        printList(this.list1);

        fillListRandomly(this.list2);
        printList(this.list2);

        printList(getCommon(this.list1, this.list2));
    }

    private void fillListRandomly(List<Integer> list) {
        if (!list.isEmpty()) {
            list.clear();
        }
        while (list.size() < 10) {
            list.add((int) (Math.round(Math.random() * 10)));
        }
    }

    private List<Integer> getCommon(List<Integer> list1, List<Integer> list2) {
        list1.retainAll(list2);
        return list1.stream().distinct().collect(Collectors.toList());
    }

    private void printList(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Given List is empty :(");
        } else {
            System.out.println();
            for (Integer i : list) {
                System.out.print(i + " ");
            }
        }
    }
}

