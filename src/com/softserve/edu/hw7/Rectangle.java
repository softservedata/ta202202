package com.softserve.edu.hw7;

class Rectangle extends  Figure {
    private String figureName;
    private int shortSide, longSide;
    int rectanglePerimeter;

    public Rectangle (String figureName, int shortSide, int longSide) {
        this.figureName = figureName;
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    public int calculatePerimeter () {
        rectanglePerimeter = 2 * (this.shortSide + this.longSide);
        return rectanglePerimeter;
    }

    public int getRectanglePerimeter () {
        calculatePerimeter();
        return rectanglePerimeter;
    }

    public String getFigureName () { return figureName; }

    public void setFigureName (String addName) { this.figureName = addName; }

    public void setShortSide (int addshortside) {
        this.shortSide = addshortside;
    }

    public void setLongSide (int addlongside) {
        this.shortSide = addlongside;
    }
}
