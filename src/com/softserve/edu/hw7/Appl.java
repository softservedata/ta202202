package com.softserve.edu.hw7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>() {{
            add(new Rectangle(20, 30));
            add(new Rectangle(40, 30));
            add(new Square(25));
            add(new Triangle(40, 40, 40));
        }};
        Figure maxItem = list.stream().max(Comparator.comparing(Figure::getPerimeter)).orElse(null);
        if (list.stream().filter(i -> i.getPerimeter() == maxItem.getPerimeter()).count() == list.size()) {
            print();
        } else print(maxItem.getPerimeter());
    }

    private static void print() {
        System.out.println("\nAll given figures have equal perimeters");
    }

    private static void print(int p) {
        System.out.printf("\nThe max perimeter is: %d%n", p);
    }
}
