package com.softserve.edu.hw4;
import java.util.Arrays;

public class Product  {
    private String name;
    private double price;

    //constructor
    public Product (String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public Product ()
    {
        this("Please select product", 0.0);
    }

    //name getter
    public String getName ()
    {
        return name;
    }

    //name setter
    public void setName (String addName)
    {
        this.name = addName;
    }

    //price getter
    public double getPrice ()
    {
        return price;
    }

    //price setter
    public void setPrice (double addPrice)
    {
        this.price = addPrice;
    }

    public static void main(String[] args)
    {
        Product product1 = new Product("Milk", 20.5);
        Product product2 = new Product("Bread", 5.4);
        Product product3 = new Product("Apple", 1.2);
        Product product4 = new Product("Pork", 55.4);

        System.out.println("Product name example: " + product3.name);

        //name of the most expensive product
        Product[] productsArray = {product1, product2, product3, product4};
        Arrays.sort(productsArray, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("The most expensive product is " + productsArray[3].name + " and its price is " + productsArray[3].price);
    }

}
