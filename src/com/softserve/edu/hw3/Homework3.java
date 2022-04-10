package com.softserve.edu.hw3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Roman! Please type any number ");
        double a = sc.nextDouble();
        System.out.println("One more number please ");
        double b = sc.nextDouble();
        System.out.println("And final number is ");
        double c = sc.nextDouble();

        if (a <= b && b <= c) {
            System.out.println("Your numbers are " + a + " " + b + " " + c);
        } else if (a <= b && b > c) {
            System.out.println("Your numbers are " + a + " " + c + " " + b);
        } else if (b <= a && b <= c && a <= c) {
            System.out.println("Your numbers are " + b + " " + a + " " + c);
        } else if (b <= a && b <= c && a > c) {
            System.out.println("Your numbers are " + b + " " + c + " " + a);
        } else if (c <= b && b <= a) {
            System.out.println("Your numbers are " + c + " " + b + " " + a);
        } else if (c <= b && b > a) {
            System.out.println("Your numbers are " + c + " " + a + " " + b);
        }

        sc.close();
    }
}

