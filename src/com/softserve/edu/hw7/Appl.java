package com.softserve.edu.hw7;

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle   ("first rectangle",2.0, 4.0),
                new Rectangle   ("second rectangle", 22.0, 2.0),
                new Square      ("square", 9.0),
                new Triangle    ("triangle", 2.0, 3.0, 4.5)};
        Figure maxPerimeter = findMaxPerimeter(figures);
        Figure maxArea = findMaxArea(figures);
        System.out.println("The figure with the largest perimeter is " + maxPerimeter.getName() +
                " with a perimeter of " + maxPerimeter.getPerimeter());
        System.out.println("The figure with the largest area is " + maxArea.getName() +
                " with an area of " + maxArea.getArea());
    }

    private static Figure findMaxArea(Figure[] figures) {
        Figure maxArea = figures[0];
        for (Figure figure: figures) {
            if (figure.getArea() > maxArea.getArea()) {
                maxArea = figure;
            }
        }
        return maxArea;
    }

    private static Figure findMaxPerimeter(Figure[] figures) {
        Figure maxPerimeter = figures[0];
        for (Figure figure: figures) {
            if (figure.getPerimeter() > maxPerimeter.getPerimeter()) {
                maxPerimeter = figure;
            }
        }
        return maxPerimeter;
    }
}
