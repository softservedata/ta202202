package com.softserve.edu.hw7;


import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("Rectangle1", 5, 10);
        Rectangle rectangle2 = new Rectangle("Rectangle2",8, 11);
        Square square = new Square("Square",5);
        Triangle triangle = new Triangle("Triangle",5, 8, 9);
        System.out.println("Rectangle1 perimeter is " + rectangle1.calculatePerimeter());
        System.out.println("Rectangle2 perimeter is " + rectangle2.calculatePerimeter());
        System.out.println("Square perimeter is " + square.calculatePerimeter());
        System.out.println("Triangle perimeter is " + triangle.calculatePerimeter());

        Figure[] figuresArray = {rectangle1, rectangle2, square, triangle};
        Arrays.sort(figuresArray, (f1, f2) -> Integer.compare(f1.calculatePerimeter(), f2.calculatePerimeter()));
        System.out.print("The figure with the biggest perimeter is " + figuresArray[3].getFigureName());
    }
}
