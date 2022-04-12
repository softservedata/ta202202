package com.softserve.edu07c;

public class Appl {

    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(4),
                new Rectangle(2, 3),
                new Cube(2),
                new Circle(1)
        };
        //
        for (Figure current : figures) {
            System.out.println("area = " + current.getArea());
            if (current instanceof Volumetric) {
                System.out.println("volume = " + ((Volumetric) current).getVolume());
            }
        }
    }

}
