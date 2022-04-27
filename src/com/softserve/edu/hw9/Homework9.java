package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework9 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        ArrayList<Integer> arraylist2 = new ArrayList<>();
        List commonList = new ArrayList();
        arraylist1.add(1);
        arraylist1.add(2);
        arraylist1.add(3);
        arraylist1.add(4);
        arraylist2.add(3);
        arraylist2.add(1);
        arraylist2.add(6);
        arraylist2.add(7);

        //test
        int iterationLength = Math.max(arraylist1.size(), arraylist2.size());
        for (int i = 0; i < iterationLength; i++) {
            if (arraylist2.contains(arraylist1.get(i))) {
                commonList.add(arraylist1.get(i));
                System.out.println("Common element in arraylist1 and arraylist2: " + arraylist1.get(i));
            }
        }
        System.out.println("List with common items: " + commonList);
    }
}



