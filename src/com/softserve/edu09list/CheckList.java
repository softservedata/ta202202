package com.softserve.edu09list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckList {

    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        //
        lst1.retainAll(lst2);
        System.out.println(lst1);
    }

}
