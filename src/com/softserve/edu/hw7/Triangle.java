package com.softserve.edu.hw7;

public class Triangle extends Figure {
    int sideA;
    int sideB;
    int sideC;

    @Override
    int getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
