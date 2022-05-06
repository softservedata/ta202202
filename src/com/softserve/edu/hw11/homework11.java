package com.softserve.edu.hw11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework11 {
    public static void main(String[] args) {

        String pattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{12,})";
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Roman! Please enter your password .. \n");
        String text = sc.next();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.println("the password is VALID");
        } else {
            System.out.println("the password is NOT VALID");
        }
        m.reset();
    }
}
