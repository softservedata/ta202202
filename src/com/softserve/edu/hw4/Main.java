package com.softserve.edu.hw4;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Rice", 30);
        Product product2 = new Product("Milk", 40);
        Product product3 = new Product("Tea", 55);
        Product product4 = new Product("Sausage", 115);
        Product[] arr = new Product[]{product1, product2, product3, product4};
        printMaxPriceName(arr);
    }

    public static void printMaxPriceName(Product[] arr) {
        int maxPrice = 0;
        String maxPriceName = null;

//here we're getting name for most expensive product going last in the list
        for (Product item : arr) {
            if (maxPrice == 0 || maxPrice < item.getPrice()) {
                maxPrice = item.getPrice();
                maxPriceName = item.getName();
            }
        }

//here we're getting name for others most expensive products in the list, if any
        System.out.print("The most expensive product(s): " + maxPriceName);

        for (Product item : arr) {
            if (maxPrice == item.getPrice() && !maxPriceName.equals(item.getName())) {
                System.out.print(", " + item.getName());
            }
        }
    }
}