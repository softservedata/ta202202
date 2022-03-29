package com.softserve.edu02a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App3prn {
    public static void main(String[] args) throws IOException {
        /*-
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        System.out.print("Hello. What is your name? ");
        String name = br.readLine();
        System.out.print("How old are you? ");
        int age = Integer.parseInt(br.readLine());
        //
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        //
        br.close();
        */
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        String name = sc.nextLine();
        System.out.print("How old are you? ");
        int age = sc.nextInt();
//        System.out.print("Hello. What is your sister name? ");
//        String name2 = sc.nextLine();
        //
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        //
        sc.close();
    }
}

