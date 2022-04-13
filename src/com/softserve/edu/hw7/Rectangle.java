package com.softserve.edu.hw7;

public class Rectangle extends Figure{
    private String name;

    private Double a;
    private Double b;

    public Rectangle(String name, Double a, Double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public Double getPerimeter() {
        return (2 * a)+(2 * b);
    }

    public Double getArea() {
        return a * b;
    }

    public String getName() {
        return name;
    }
}
