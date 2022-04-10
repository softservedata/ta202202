package com.softserve.edu.hw4;

public class Homework4  {

    public static void main(String[] args){
        Product product1 = new Product("Water", 22.3);
        Product product2 = new Product("Tea", 135.0);
        Product product3 = new Product("Caffe", 50.9);
        Product product4 = new Product("Juice", 75.0);

        double MaxPrice = product1.getPrice();
        String MaxProduct = product1.getName();

        if (MaxPrice < product2.getPrice()){
            MaxPrice = product2.getPrice(); MaxProduct = product2.getName();
        }
        if (MaxPrice < product2.getPrice()){
            MaxPrice = product3.getPrice(); MaxProduct = product3.getName();
        }
        if (MaxPrice < product4.getPrice()){
            MaxPrice = product4.getPrice(); MaxProduct = product4.getName();
        }

        System.out.println("max price is " + MaxPrice + " for the product - " + MaxProduct);

    }
}
