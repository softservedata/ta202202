package com.softserve.edu.hw4;

import java.util.Scanner;

/**
 * TODO: add null checks to the constructors.
 */

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the product name");
        this.name = userInput.nextLine();
        System.out.println("Now the product price");
        this.price = Double.parseDouble(userInput.nextLine());
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return (this.getName() + ", " + this.getPrice().toString());
    }
}
