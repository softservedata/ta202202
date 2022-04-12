package com.softserve.edu07c;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("\tConstructor Circle()");
    }

    @Override
    public double getArea() {
        System.out.println("Run from Circle");
        return (3.14 * (radius * 2));
    }
}