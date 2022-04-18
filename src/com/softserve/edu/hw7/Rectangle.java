package com.softserve.edu.hw7;

public class Rectangle extends Figure {
    private double width = 0.0;
    private double length = 0.0;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    ;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double GetPerimeter() {
        return (2 * (width + length));
    }

    @Override
    public String GetMyClass() {
        return "Rectangle";
    }
}
