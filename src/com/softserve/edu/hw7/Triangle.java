package com.softserve.edu.hw7;

public class Triangle extends Figure{

    private double sidea = 0.0;
    private double sideb = 0.0;
    private double sidec = 0.0;

    public Triangle(double sidea, double sideb, double sidec) {
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }

    public double getSidea() {
        return sidea;
    }

    public void setSidea(double sidea) {
        this.sidea = sidea;
    }

    public double getSideb() {
        return sideb;
    }

    public void setSideb(double sideb) {
        this.sideb = sideb;
    }

    public double getSidec() {
        return sidec;
    }

    public void setSidec(double sidec) {
        this.sidec = sidec;
    }

    @Override
    public double GetPerimeter() {
        return (sidea + sideb + sidec);
    }

}
