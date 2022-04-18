package com.softserve.edu.hw7;

import java.lang.invoke.TypeDescriptor;

public class Square extends Figure {
    private double side;

    public Square(double side){
        this.side = side;
    };

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double GetPerimeter() {
        return (4*side);
    }
}
