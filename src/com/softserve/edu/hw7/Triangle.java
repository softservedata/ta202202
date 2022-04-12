package com.softserve.edu.hw7;

class Triangle extends  Figure {
    private String figureName;
    private int sideOne, sideTwo, sideThree;
    int trianglePerimeter;

    public Triangle (String figureName, int sideOne, int sideTwo, int sideThree) {
        this.figureName = figureName;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public int calculatePerimeter () {
        trianglePerimeter = sideOne + sideTwo + sideThree;
        return trianglePerimeter;
    }

    public int getTrianglePerimeter () {
        calculatePerimeter();
        return trianglePerimeter;
    }

    public String getFigureName () { return figureName; }

    public void setFigureName (String addName) { this.figureName = addName; }

    public void setSideOne (int addsideone) {
        this.sideOne = addsideone;
    }

    public void setSideTwo (int addsidetwo) {
        this.sideTwo = addsidetwo;
    }

    public void setSideThree (int addsidethree) {
        this.sideThree = addsidethree;
    }
}
