package com.softserve.edu.hw7;

public class Square extends Figure {
    int side;
    @Override
    int getPerimeter() {
        return this.side*4;
    }
    public Square(int side){
        this.side = side;
    }
}
