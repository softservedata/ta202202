package com.softserve.edu.hw7;

public class Square extends Figure{
    private String name;
    private Double side;

    public Square(String name, Double side) {
        this.name = name;
        this.side = side;
    }

    public Double getPerimeter() {
        return 4 * side;
    }

    public Double getArea() {
        return side * side;
    }

    public String getName() {
        return name;
    }
}
