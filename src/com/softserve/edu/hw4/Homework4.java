package com.softserve.edu.hw4;

public class Homework4  {

    public static void main(String[] args){
        Product product1 = new Product("Water", 22.3);
        Product product2 = new Product("Tea", 135.0);
        Product product3 = new Product("Caffe", 50.9);
        Product product4 = new Product("Juice", 135);

        double MaxPrice = product1.getPrice();
        String MaxProduct = product1.getName();

        if (MaxPrice < product2.getPrice()){
            MaxPrice = product2.getPrice();
        }
        if (MaxPrice < product2.getPrice()){
            MaxPrice = product3.getPrice();
        }
        if (MaxPrice < product4.getPrice()){
            MaxPrice = product4.getPrice();
        }

        System.out.println("Max price product(s):");
        if (MaxPrice == product1.getPrice()){
            System.out.println("price " +product1.getPrice()+ " for product " + product1.getName());
        }
        if (MaxPrice == product2.getPrice()){
            System.out.println("price " +product2.getPrice()+ " for product " + product2.getName());
        }
        if (MaxPrice == product3.getPrice()){
            System.out.println("price " +product3.getPrice()+ " for product " + product3.getName());
        }
        if (MaxPrice == product4.getPrice()){
            System.out.println("price " +product4.getPrice()+ " for product " + product4.getName());
        }
    }
}
