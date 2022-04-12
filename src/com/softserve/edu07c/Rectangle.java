package com.softserve.edu07c;

public class Rectangle extends Figure {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("\tConstructor Rectangle()");
    }

    @Override
    public double getArea() {
        System.out.println("Run from Rectangle");
        return length * width;
    }
}
