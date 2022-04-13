package com.softserve.edu.hw7;

public class Triangle extends Figure{
    private String name;
    private Double a;
    private Double b;
    private Double c;

    public Triangle(String name, Double a, Double b, Double c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getPerimeter() {
        return a + b + c;
    }

    public Double getArea() {
        Double s = (a + b + c)/2; //semiperimeter
        Double area = Math.sqrt(s * (s - a) * (s - b) * (s * c));
        return area;
    }

    public String getName() {
        return name;
    }
}
