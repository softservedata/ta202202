package com.softserve.edu.hw7;

public class Rectangle extends Figure {
    private final int width;
    private final int height;
    @Override
    int getPerimeter() {
        return 2*(this.width+this.height);
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
}
