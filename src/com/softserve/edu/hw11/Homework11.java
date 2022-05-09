package com.softserve.edu.hw11;

import java.util.Scanner;
import java.util.regex.*;

public class Homework11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter new password. \nThe password should be at least" +
                "12 characters long, containing uppercase and lowercase letters, numbers " +
                "and the following special characters: \n " +
                "!@#&()–[{}]:;',?/\\*~$^+=<>.\n");

        String text = sc.nextLine();
        String pattern = "([a-zA-Z0-9!@#&()–\\[{}\\]:;',?\\/*~$^\\+=<>\\.\\\\]){12,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        boolean findMatch = m.find();

        if (findMatch) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is not valid! Please refer to the validation rules.");
        }

        sc.close();

    }
}
