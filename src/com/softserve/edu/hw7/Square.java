package com.softserve.edu.hw7;

class Square extends  Figure {
    private String figureName;
    private int squareSide;
    private int squarePerimeter;

    public Square (String figureName, int squareSide) {
        this.figureName = figureName;
        this.squareSide = squareSide;
    }

    public int calculatePerimeter () {
        squarePerimeter = squareSide * 4;
        return squarePerimeter;
    }

    public int getSquarePerimeter () {
        calculatePerimeter();
        return squarePerimeter;
    }

    public String getFigureName () { return figureName; }

    public void setFigureName (String addName) { this.figureName = addName; }

    public void setSquareSide (int addsquareside) {
        this.squareSide = addsquareside;
    }

}
