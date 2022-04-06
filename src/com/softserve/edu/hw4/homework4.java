package com.softserve.edu.hw4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

import static com.softserve.edu.hw3.homework3.think;

public class homework4 {
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public static void main(String[] args) throws InterruptedException {
        Product[] products = new Product[4];
        products[0] = new Product();

        System.out.println("I'll make the other three products myself, thanks.");

        products[1] = new Product("Borscht",22.2);
        products[2] = new Product("Pierogi",33.3);
        products[3] = new Product("Goulash",44.4);

        System.out.println("Now let's check the products!");
        System.out.println(printInTwoColumns("Product name:", "Price:"));
        for (Product product : products) {
            System.out.println(printInTwoColumns(product.getName(),
                    decimalFormat.format(product.getPrice())));
        }

        System.out.println("Now let's see which is the most expensive.");
        Product[] mostExpensiveProducts = findMostExpensiveProducts(products);
        Thread.sleep(2000);
        think();
        printMostExpensiveProducts(mostExpensiveProducts);
    }

    private static Product[] findMostExpensiveProducts(Product[] products) {
        Arrays.sort(products, Collections.reverseOrder(
                Comparator.comparing(Product::getPrice).thenComparing(Product::getName)));
        int position = 0;
        for (int i = 0; i<4; i++) {
            if (!Objects.equals(products[i].getPrice(), products[i + 1].getPrice())) {
                position = i;
                break;
            }
        }
        Product[] mostExpensiveProducts = new Product[position+1];
        System.arraycopy(products, 0, mostExpensiveProducts, 0, position + 1);
        return mostExpensiveProducts;
    }

    private static void printMostExpensiveProducts(Product[] mostExpensiveProducts) {
        System.out.print("The most expensive stuff in the list is ");
        int i = 1;
        for (Product product : mostExpensiveProducts) {
            if(i == mostExpensiveProducts.length) {
                System.out.print(product.getName());
            }
            else {
                System.out.print(product.getName() + " and ");
                i++;
            }
        }
        System.out.print(" that cost " + decimalFormat.format(mostExpensiveProducts[0].getPrice()));
    }

    private static String printInTwoColumns(String column1, String column2) {
        return String.format("%-30s %10s", column1, column2);
    }
}
