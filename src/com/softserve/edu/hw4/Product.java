package com.softserve.edu.hw4;

import java.util.Scanner;

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
        if (this.name.length() == 0) {
            this.name = "null";
            System.err.println("That was very rude. Your product is now named NULL.");
        }
        System.out.println("Now the product price");
        try {
            this.price = Double.parseDouble(userInput.nextLine());
        }
        catch(Exception e) {
            this.name = "DIRTY CODE BREAKER";
            this.price = 0.0;
            System.err.println("Are you TRYING to break the code? Your product is DISQUALIFIED!");
        }
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
