package com.softserve.edu.hw9;

import java.util.*;

public class homework9 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> list3 = new HashSet<>();

        int length = 10;
        Random num = new Random();

        for (int i = 0; i<length; i++){
            list1.add(num.nextInt(10));
        }
        for (int i = 0; i<length; i++){
            list2.add(num.nextInt(10));
        }
        System.out.println("First list \n" + list1);
        System.out.println("Second list \n" + list2);

        for (int i = 0; i<list1.size(); i++){
            for (int j = 0; j<list2.size(); j++){
                if (list1.get(i).equals(list2.get(j))){
                    list3.add(list1.get(i));
                }
            }
        }
        System.out.println("Equal elements are: \n" + list3);
    }
}
