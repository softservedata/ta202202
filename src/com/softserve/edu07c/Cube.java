package com.softserve.edu07c;

public class Cube extends Figure implements Volumetric {
    private double width;

    public Cube(double width) {
        this.width = width;
        System.out.println("\tConstructor Cube()");
    }
    
    @Override
    public double getArea() {
        System.out.println("Run from Cube");
        return 6*width*width;
    }
    
    @Override
    public double getVolume() {
        System.out.println("Run from Cube");
        return width*width*width;
    }
}
