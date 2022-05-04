package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class homework9 {
    public static void main(String[] args) {
        System.out.println("First we'll create two ArrayLists and fill them with random numbers.");
        List<Integer> list1 = createRandomIntegerArrayList(7, 10);
        List<Integer> list2 = createRandomIntegerArrayList(10, 15);
        System.out.println("1st list has the following elements: " + list1);
        System.out.println("2nd list has the following elements: " + list2);
        System.out.println("Now we'll create a new List that's composed of common elements of previous two.");
        List<Integer> commonList = list1; //creating a new list in order to not overwrite list1
        commonList.retainAll(list2);
        System.out.println("And here they are: " + commonList);
        List<Integer> distinctCommonList = commonList.stream().distinct().collect(Collectors.toList());
        System.out.println("Just in case you meant showing only distinct elements: " + distinctCommonList);
    }

    private static ArrayList<Integer> createRandomIntegerArrayList(Integer size, Integer limit) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < size) {
            list.add(random.nextInt(limit+1));
        }
        return list;
    }
}
