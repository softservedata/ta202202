package com.softserve.edu.hw7;

public class Appl {
    public static void main(String[] args) {
        Figure[] arr1 = {
                new Square(55.55),
                new Triangle(22.33, 33.44, 44.55),
                new Triangle(20.30, 30.40, 40.55),
                new Rectangle(34.67, 66.12),
                new Rectangle(05.05, 12.12)
        };

        Double MaxPer = 0.0;
        String figure = "";
        int i = 0;
        for (i = 0; i < arr1.length; i++) {
            if (MaxPer < arr1[i].GetPerimeter()) {
                MaxPer = arr1[i].GetPerimeter();
                figure = String.valueOf(arr1[i].getClass());
            }
            ;
        }
        ;
        System.out.println("Max perimeter is " + MaxPer + " for figure " + figure);

    }
}
